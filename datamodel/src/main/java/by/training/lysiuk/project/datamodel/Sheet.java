package by.training.lysiuk.project.datamodel;

import java.util.Map;

public class Sheet extends AbstractModel {
	private Map<Faculty, Map<Enrolee, Double>> sheet;

	public Map<Faculty, Map<Enrolee, Double>> getSheet() {
		return sheet;
	}

	public void setSheet(Map<Faculty, Map<Enrolee, Double>> sheet) {
		this.sheet = sheet;
	}
}
