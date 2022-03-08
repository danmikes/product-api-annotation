package com.wiredbraincoffee.productapiannotation.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductEvent {

  private Long eventId;

  private String eventType;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductEvent that = (ProductEvent) o;
    return Objects.equals(eventId, that.eventId) && Objects.equals(eventType, that.eventType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, eventType);
  }

  @Override
  public String toString() {
    return "ProductEvent{" +
      "eventId=" + eventId +
      ", eventType='" + eventType + '\'' +
      '}';
  }
}
