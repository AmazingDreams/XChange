package org.knowm.xchange.bitz.dto.trade.result;

import org.knowm.xchange.bitz.dto.BitZResult;
import org.knowm.xchange.bitz.dto.trade.BitZTradeAdd;
import com.fasterxml.jackson.annotation.JsonProperty;

public class BitZTradeAddResult extends BitZResult<BitZTradeAdd> {

  public BitZTradeAddResult(
      @JsonProperty("code") int code,
      @JsonProperty("msg") String message,
      @JsonProperty("data") BitZTradeAdd data) {
    super(code, message, data);
  }
}
