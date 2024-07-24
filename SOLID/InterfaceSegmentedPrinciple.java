/* Interfaces should be such that, client should not implement unnecessary functions they do not need. */

interface RestaurantEmployee {
    void washDishes();
    void serveCustomers();
    void cookFood();
}

class Waiter implements RestaurantEmployee {

    @Override
    public void washDishes() {
        // not my job
    }

    @Override
    public void serveCustomers() {
        System.out.println("serves customers");
    }

    @Override
    public void cookFood() {
        // not my job
    }
}

interface WaiterInterface {
    void serveCustomers();
    void takeOrders();
}

interface ChefInterface {
    void cookFood();
    void decideMenu();
}

class Waiter2 implements WaiterInterface {

    @Override
    public void serveCustomers() {
        System.out.println("serves customers");
    }

    @Override
    public void takeOrders() {
        System.out.println("takes orders");
    }
}

class Chef implements ChefInterface {

    @Override
    public void cookFood() {
        System.out.println("cooks food");
    }

    @Override
    public void decideMenu() {
        System.out.println("decides menu");
    }
}
