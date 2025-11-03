package Ejer6;

import Ejer5.Book2;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
public class Library2 {
        protected List<Book2> listaLibros;

        public Library2() {
            this.listaLibros = new ArrayList<>();
        }

        public Library2(ArrayList<Book2> listaLibros){
            this.listaLibros = listaLibros;
        }

        @XmlElement
        public List<Book2> getListaLibros() {
            return listaLibros;
        }

        public void setListaLibros(List<Book2> listaLibros) {
            this.listaLibros = listaLibros;
        }

        @Override
        public String toString() {
            return "Library{" +
                    "listaLibros=" + listaLibros +
                    '}';
        }

        public void aniadirLibros(Book2 libro){
        if (libro != null){
            listaLibros.add(libro);
        }
    }
}