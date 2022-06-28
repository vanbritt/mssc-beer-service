package guru.springframework.msscbeerservice.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Positive;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {
    @Null
    private UUID id;
    @Null
    private  Integer version;
    @NotNull
    private BeerStyleEnum beerStyle;
    @Positive
    private Long upc;

    @Positive
    @NotNull
    private BigDecimal price;


    @NotBlank
    private String beerName;

    private Integer quantityOnHand;

    @Null
    private OffsetDateTime lastModifiedDate;
    @Null
    private OffsetDateTime createdDate;


}
