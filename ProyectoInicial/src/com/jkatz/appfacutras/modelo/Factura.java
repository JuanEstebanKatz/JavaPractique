package com.jkatz.appfacutras.modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Factura {
    private int folio; // id
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private final ItemFactura [] items;
    private int indiceItems;
    public static final int MAX_ITEMS = 12;
    private static int ultimoFolio;

    public Factura(String descripcion, Cliente cliente) {
        this.descripcion = descripcion;
        this.cliente = cliente;
        this.items = new ItemFactura[MAX_ITEMS];
        ultimoFolio = ++ultimoFolio;
        this.fecha = new Date();
    }

    public int getFolio() {
        return folio;
    }


    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ItemFactura[] getItemFactura() {
        return items;
    }
    public void addItemFactura(ItemFactura item){
        if(indiceItems < MAX_ITEMS){
        this.items[indiceItems++] = item;
        }
    }

    public float calcularTotal(){
        float total = 0.0f;
        for (ItemFactura item : this.items){
            // lo mismo que decir que si es nulo no lo sume !(item instanceof  ItemFactura
            if(item == null){
               continue;
            }
            total += item.calcularimporte();
        }

        return total;
    }

    public String generarDetalle(){
        StringBuilder sb = new StringBuilder("Factura N°: ");
        sb.append(folio)
                .append("\n Cliente:")
                .append(this.cliente.getNombre())
                .append("\t NIF: ")
                .append(cliente.getNif())
                .append("\n Descripcion: ")
                .append(this.descripcion)
                .append(this.descripcion)
                .append("\n");

        SimpleDateFormat df = new SimpleDateFormat("dd 'de' MMMM, yyyy");
        sb.append("Fecha Emision: ").append(df.format(this.fecha))
                .append("\n")
                .append("\n#\tNombre\t$\tCant.\tTotal\n");

        for (ItemFactura itemFactura: this.items){
            if(itemFactura == null){
                continue;
            }
            sb.append(itemFactura.getProducto().getCodigo())
                    .append("\t")
                    .append(itemFactura.getProducto().getNombre())
                    .append("\t")
                    .append(itemFactura.getProducto().getPrecio())
                    .append("\t")
                    .append(itemFactura.getCantidad())
                    .append("\t")
                    .append(itemFactura.calcularimporte())
                    .append("\n");
        }
        sb.append("\n Gran Total:")
                .append(calcularTotal());

        return sb.toString();
    }
}
