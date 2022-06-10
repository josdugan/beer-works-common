package com.josdugan.beerworkscommon.events;

import com.josdugan.beerworkscommon.dtos.BeerDto;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class NewInventoryEvent extends BeerEvent {
    public NewInventoryEvent(BeerDto beerDto) {
        super(beerDto);
    }
}
