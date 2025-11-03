package Ejer2;

import java.util.ArrayList;
import java.util.List;


public class ListaProductos1 {
    private List<Producto> listaProductos;

    public ListaProductos1() {
        this.listaProductos = new ArrayList<>();
    }

    public ListaProductos1(List<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public List<Producto> getListaProductos() {
        return listaProductos;
    }
}