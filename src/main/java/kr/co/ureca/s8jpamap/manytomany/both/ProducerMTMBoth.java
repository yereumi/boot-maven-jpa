package kr.co.ureca.s8jpamap.manytomany.both;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import kr.co.ureca.entity.BaseEntity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Table(name = "producer_mtm_both")
public class ProducerMTMBoth extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String code;

	private String name;

	@ManyToMany
//	@JoinTable(name = "producer_product")
	@ToString.Exclude
	private List<ProductMTMBoth> products = new ArrayList<>();

	public void addProduct(ProductMTMBoth product) {
		products.add(product);
	}

} // class
