package pe.edu.upc.serviceinterfeaces;

import java.util.List;

import pe.edu.upc.entity.usuario;

public interface IUsuarioIntefaces {
	public void insert(usuario u);
	List<usuario>list();
}
