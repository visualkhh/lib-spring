package com.ceragem.iot.core.domain;

import com.ceragem.iot.core.domain.base.AuthUrlBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@EqualsAndHashCode(callSuper=false)
@Entity
@Table(name="T_AUTH_URL")
public class CoreAuthUrl extends AuthUrlBase {

	@ManyToOne
	@JoinColumn(name="URL_SEQ" , referencedColumnName  = "URL_SEQ",   insertable = false, updatable = false)
	@OrderBy("MENU_ORD ASC")
	private CoreUrl url;
}
