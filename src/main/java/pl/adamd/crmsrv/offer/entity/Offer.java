package pl.adamd.crmsrv.offer.entity;

import lombok.*;
import org.hibernate.annotations.DynamicUpdate;
import pl.adamd.crmsrv.client.entity.Client;
import pl.adamd.crmsrv.device.entity.Device;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "offers")
@DynamicUpdate
public class Offer {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "clients_id")
    private Client client;
    private List<Device> devices;
    private List<Installation> installationList;
    private BigDecimal totalPrice;
    private LocalDate dayOfStart;
    private LocalDate dayOfEnd;

}
