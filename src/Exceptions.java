public class Exceptions {
    public static void main(String[] args) {

        //Wyjątki dzielimy na NIEKONTRLOWANE które trzeba obsłużyć i KONTROLOWANE które można, ale nie trzeba obsłużyć.
        //Wyjątki NIEKONTROLOWANE dziedziczą po klasie RuntimeException
        //Wyjątki rzucamy korzystając z instrukcji TRY CATCH, jeśli rzucamy wyjątek kontrolowany musimy dodatkowo w sygnaturze
        // metody/konstruktora zadeklarować wyjątek używając słowa THROWS
        //Do bloku try-catch możemy dodać dodatkowo blokFINALLY, który wykona się zawsze, niezależnie, czy w bloku try wyjątek
        // wystąpił, czy nie.
    }
}
