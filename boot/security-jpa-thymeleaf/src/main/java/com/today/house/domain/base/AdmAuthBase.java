package com.today.house.domain.base;

import com.fasterxml.jackson.annotation.JsonView;
import com.today.house.model.ModelBase;
import com.today.house.model.view.json.JsonViewFrontEnd;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@MappedSuperclass
@EqualsAndHashCode(callSuper=false)
public class AdmAuthBase extends ModelBase implements Serializable {
    @Id
    @Column(name = "ADM_AUTH_SEQ")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @JsonView({JsonViewFrontEnd.class})
    private Long admAuthSeq;

    @Column(name = "ADM_SEQ")
    @JsonView({JsonViewFrontEnd.class})
    private Long admSeq;

    @Column(name = "AUTH_ID")
    @JsonView({JsonViewFrontEnd.class})
    private String authId;
}