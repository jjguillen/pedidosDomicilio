## Ejemplo de clase para gestionar pedidos online a restaurante

1. Plato: platos que puedes pedir: id, nombre, precio, descripcion
2. Cliente: dni, nombre, email, telefono
3. Pedido: id, fecha, cliente, direccion, estado, platos (Map<String,Plato>)
4. Pedidos: `ArrayList<Pedido>`
5. Ordenación de pedidos por:
    - Fecha
    - Cliente
    - Estado

