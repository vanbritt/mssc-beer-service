package guru.springframework.msscbeerservice.bootstrap;

import guru.springframework.msscbeerservice.domain.Beer;
import guru.springframework.msscbeerservice.repositories.BeerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class BeerLoader implements CommandLineRunner {
    private final BeerRepository beerRepository;

    public BeerLoader(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadBeers();

    }

    private void loadBeers() {
        if(beerRepository.count()==0){
            beerRepository.save(Beer.builder()
                                .beerName("HEINEKEN")
                                .beerStyle("LAGER")
                                .price(new BigDecimal("12.95"))
                                .quantityToBrew(200L)
                                .upc(33700000L)
                                .build());
            beerRepository.save(Beer.builder()
                    .beerName("GUINESS")
                    .beerStyle("STOUT")
                    .price(new BigDecimal("15.0"))
                    .quantityToBrew(100L)
                    .upc(44600000L)
                    .build());
        }

        System.out.println("Beer loaded");
    }
}
