// class should depend on interfaces rather than concrete classes

class WiredKeyBoard {
    public void click() {
        // do something
    }
}

class WiredMouse {
    public void click() {
        // do something
    }
}

class Macbook {
    private final WiredKeyBoard wiredKeyBoard;
    private final WiredMouse wiredMouse;

    public Macbook() {
        this.wiredKeyBoard = new WiredKeyBoard();
        this.wiredMouse = new WiredMouse();
    }

    public void click() {
        wiredKeyBoard.click();
        wiredMouse.click();
    }
}

interface KeyBoard {
    void click();
}

interface Mouse {
    void click();
}

class MacbookPro {
    private final KeyBoard keyBoard;
    private final Mouse mouse;

    public MacbookPro(KeyBoard keyBoard, Mouse mouse) {
        this.keyBoard = keyBoard;
        this.mouse = mouse;
    }

    public void click() {
        keyBoard.click();
        mouse.click();
    }
}
