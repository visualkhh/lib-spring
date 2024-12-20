package com.company.service.monitor.domain.mindcares.ceracheck;

import com.company.service.monitor.domain.mindcares.base.MeasureRelationshipBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@Entity(name = "ceracheck-MeasureRelationship")
@Table(name = "T_MEASURE_RELATIONSHIP")
public class MeasureRelationship extends MeasureRelationshipBase implements Serializable {
}
