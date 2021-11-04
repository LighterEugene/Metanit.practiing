package ContinuingStudy;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Condition;
public class ConditionTwo {
    public static void main(String[] args) {

            StoreTwo storeTwo =new StoreTwo();
            Producer2 producer2 = new Producer2(storeTwo);
            ConsumerTwo consumerTwo = new ConsumerTwo(storeTwo);
            new Thread(producer2).start();
            new Thread(consumerTwo).start();
        }
    }
    // Класс Магазин, хранящий произведенные товары
    class StoreTwo {
        private int product=0;
        ReentrantLock locker;
        Condition condition;

        StoreTwo(){
            locker = new ReentrantLock(); // создаем блокировку
            condition = locker.newCondition(); // получаем условие, связанное с блокировкой
        }

        public void get() {

            locker.lock();
            try{
                // пока нет доступных товаров на складе, ожидаем
                while (product<1)
                    condition.await();

                product--;
                System.out.println("Покупатель купил 1 товар");
                System.out.println("Товаров на складе: " + product);

                // сигнализируем
                condition.signalAll();
            }
            catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
            finally{
                locker.unlock();
            }
        }
        public void put() {

            locker.lock();
            try{
                // пока на складе 3 товара, ждем освобождения места
                while (product>=3)
                    condition.await();

                product++;
                System.out.println("Производитель добавил 1 товар");
                System.out.println("Товаров на складе: " + product);
                // сигнализируем
                condition.signalAll();
            }
            catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
            finally{
                locker.unlock();
            }
        }
    }
    // класс Производитель
    class Producer2 implements Runnable{

        StoreTwo storeTwo;
        Producer2(StoreTwo storeTwo){
            this.storeTwo = storeTwo;
        }
        public void run(){
            for (int i = 1; i < 6; i++) {
                storeTwo.put();
            }
        }
    }
    // Класс Потребитель
    class ConsumerTwo implements Runnable{

        StoreTwo storeTwo;
        ConsumerTwo(StoreTwo storeTwo){
            this.storeTwo = storeTwo;
        }
        public void run(){
            for (int i = 1; i < 6; i++) {
                storeTwo.get();
            }
        }
    }

