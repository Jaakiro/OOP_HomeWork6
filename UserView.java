package org.example.hw6;

import java.util.List;

public interface UserView<T extends User> { // (Принцип открытости-закрытости, применим при создании интерфейса и позже
    // наследовать его для дальнейшей реализации
    void sendOnConsole(List<T> list);
}
