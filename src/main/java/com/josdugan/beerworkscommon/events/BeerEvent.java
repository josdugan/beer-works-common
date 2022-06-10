package com.josdugan.beerworkscommon.events;

import com.josdugan.beerworkscommon.dtos.BeerDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerEvent implements Serializable {

    private static final long serialVersionUID = 2007916035508948998L;

    private BeerDto beerDto;
}
