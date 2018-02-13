package br.com.lima.converters;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.com.lima.models.Autor;

@FacesConverter("autorConverter")
public class AutorConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String id) {

		if (id == null || id.trim().isEmpty()) {
			return null;
		}

		return new Autor(Integer.valueOf(id));

	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object dataObject) {
		
		if(dataObject == null) {
			return null;
		}
		
		Autor autor = (Autor) dataObject;
		
		return String.valueOf(autor.getId());
	}

}
