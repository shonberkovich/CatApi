package org.example;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
  @JsonIgnoreProperties(ignoreUnknown = true)
public class CatFactsResponse {
    private List<Data>data;

      public List<Data> getData() {
          return data;
      }

      @Override
      public String toString() {
          return "CatFactsResponse{" +
                  "data=" + data +
                  '}';
      }

      public void setData(List<Data> data) {
          this.data = data;
      }
  }
