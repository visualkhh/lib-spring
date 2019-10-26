package com.omnicns.medicine.domain;

import com.omnicns.medicine.domain.base.GameRstBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Getter @Setter @EqualsAndHashCode(callSuper=false) @Entity @Table(name="T_GAME_RST")
public class GameRst extends GameRstBase implements Serializable{
}
