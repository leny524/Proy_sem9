package pe.edu.certus.servicio3;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;
@Component
@ApplicationPath("/api")
public class Servicio3AppConfig  extends ResourceConfig{
	
	public Servicio3AppConfig() {
		packages ("pe.edu.pe.items");
	}		
}
