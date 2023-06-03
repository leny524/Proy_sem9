package pe.edu.certus.items;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import java.util.ArrayList;

@Path("/itemss")
public class ItemsRecurso {
	List<Items> itemss= new ArrayList<Items>();
	
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public List<Items> getItems(){
		itemss.add(new Items ("TV", "LG",500));
		itemss.add(new Items ("Radio", "SONY",230));
		itemss.add(new Items ("PC", "TEROS",2100));
		return itemss;
	}
	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public  List <Items> guardarItems(Items items){
		itemss.add(new Items ( "Radio", "SONY ",230));
		itemss.add(items);
		return itemss;
	}


}
