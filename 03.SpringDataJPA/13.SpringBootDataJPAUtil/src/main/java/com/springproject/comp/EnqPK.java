package com.springproject.comp;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EnqPK {

	private Integer enqId;

	private String enqHolder;

	@Override
	public String toString() {
		return "EnqPK [enqId=" + enqId + ", enqHolder=" + enqHolder + "]";
	}

}
