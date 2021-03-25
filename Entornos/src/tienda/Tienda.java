package tienda;
public class Tienda {
static boolean tiene_suficiente_dinero(Persona pe, Producto pr, int uds_pedidas) {
double coste;
coste=pr.getPrecio()*uds_pedidas;
if (pe.getDinero()>=coste)
return true;
else
return false;
}
static Persona inicializar_persona(String n, double d) {
Persona pe=new Persona();
pe.setDinero(d);
pe.setNombre(n);
return pe;
}
static Producto inicializar_producto(String n, double p, int u) {
Producto pr=new Producto();
pr.setNombre_producto(n);
pr.setPrecio(p);
pr.setUnidades(u);
return pr;
}
static void realizar_compra(Persona pe, Producto pr, int uds_pedidas) {
int uds_restantes;
double dinero_restante, coste;
uds_restantes=pr.getUnidades()-uds_pedidas;
pr.setUnidades(uds_restantes);
coste=uds_pedidas*pr.getPrecio();
dinero_restante=pe.getDinero()-coste;
pe.setDinero(dinero_restante);
}
static void realizar_pedido(Producto pr, Persona pers, int u) {
	
	if (pr.quedan_unidades()) {
		if (pr.getUnidades()<u) {
		u=pr.getUnidades();
		System.out.println("No hay suficientes unidades. Compraremos "+u+" unidades");
		}
		if (tiene_suficiente_dinero(pers,pr,u)) {
		realizar_compra(pers,pr,u);
		System.out.println("Compra realizada con éxito. Saldo y stock actualizados");
		}
		else
		System.out.println("No tiene suficiente dinero. Tiene "+pers.getDinero()+" y cuestan"+pr.getPrecio()*u);
		}
		else
		System.out.println("No queda ninguna unidad de "+pr.getNombre_producto());
		
	
}
public static void main(String[] args) {
Persona pers1, pers2;
Producto prod1, prod2, prod3;
pers1=inicializar_persona("Pepe",100);
pers2=inicializar_persona("Juan",80);
prod1=inicializar_producto("libro",3,10);
prod2=inicializar_producto("vino",4,25);
prod3=inicializar_producto("camiseta",6,15);
realizar_pedido(prod3,pers1,5);
realizar_pedido(prod1,pers2,5);
realizar_pedido(prod2,pers1,3);
}
}

