package Ejer2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name="listaProductos")
@XmlAccessorType(XmlAccessType.FIELD)
public class ListaProductos {
    private List<Producto2> listaProductos;

    public ListaProductos() {
        this.listaProductos = new ArrayList<>();
    }

    public ListaProductos(List<Producto2> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public List<Producto2> getListaProductos() {
        return listaProductos;
    }
}