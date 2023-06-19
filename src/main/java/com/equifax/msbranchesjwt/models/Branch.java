package com.equifax.msbranchesjwt.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table( name = "branch")
@Getter
@Setter
public class Branch {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private String address;
  private String latitude;
  private String longitude;

  public Branch(String name, String address, String latitude, String longitude) {
    this.name = name;
    this.address = address;
    this.latitude = latitude;
    this.longitude = longitude;
  }

  public Branch() {}
}
