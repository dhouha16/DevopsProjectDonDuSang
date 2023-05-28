package com.pfa.dto;

import java.util.Date;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Data
@NoArgsConstructor
public class Analysedto {
	private Long idReponse;
	private Date date;
	private boolean analyseAccepter;
	private String description;
	public Analysedto(Long idReponse, Date date, boolean analyseAccepter,
			String description) {
		super();
		this.idReponse = idReponse;
		this.date = date;
		this.analyseAccepter = analyseAccepter;
		this.description = description;
	}
	
}
