package pl.adamd.crmsrv.device.entity;

import lombok.*;
import org.hibernate.annotations.DynamicUpdate;
import pl.adamd.crmsrv.offer.entity.Execution;
import pl.adamd.crmsrv.offer.entity.Offer;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "devices")
@DynamicUpdate
public class Device {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String name;
    private String producer;
    private String serialNumber;
    private String power;
    private BigDecimal price;

    @ManyToOne
    @JoinColumn(name = "executions_id")
    private Execution execution;

    @ManyToOne
    @JoinColumn(name = "offers_id")
    private Offer offers;

}
