package uabc.auditoria.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import uabc.auditoria.model.Curso;

@Service
public class CursosServiceImpl implements ICursosService {
	private List<Curso> lista = null;

	public CursosServiceImpl() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		lista = new LinkedList<Curso>();
		try {
			Curso curso1 = new Curso();
			curso1.setId(1);
			curso1.setNombre("Declaración Patrimonial");
			curso1.setDescripcion(
					"En este curso se presentará información referente a la presentación de su declaración patrimonial y el sistema informático Sudep");
			curso1.setFecha(sdf.parse("05-05-2022"));
			curso1.setPresentador("Juan Luis Martinéz Jacobo");
			curso1.setModalidad(1);
			curso1.setPlataforma("Blackboard");
			curso1.setLiga("https://us.bbcollab.com/guest/9104f932688440889a653985437552db");
			curso1.setEstatus(1);
			curso1.setImagen("declaracion.jpg");

			Curso curso2 = new Curso();
			curso2.setId(2);
			curso2.setNombre("Ética y Valores");
			curso2.setDescripcion(
					"En este curso se hablara sobre temas referentes a la Ética y Valores dentro de un Ambiente Laboral");
			curso2.setFecha(sdf.parse("08-08-2022"));
			curso2.setPresentador("Daniela Castellanos");
			curso2.setModalidad(1);
			curso2.setPlataforma("Blackboard");
			curso2.setLiga("https://us.bbcollab.com/guest/957585444447589444734398543789hgo");
			curso2.setEstatus(1);
			curso2.setImagen("eticayvalores.png");

			lista.add(curso1);
			lista.add(curso2);

		} catch (ParseException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

	@Override
	public List<Curso> buscarTodos() {
		// TODO Auto-generated method stub
		return lista;
	}

	@Override
	public Curso buscarPorId(Integer idCurso) {
		for (Curso c : lista) {
			if (c.getId() == idCurso) {
				return c;
			}
		}
		return null;
	}

	@Override
	public void guardar(Curso curso) {
		lista.add(curso);
	}

}
