package com.awesh.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Product {
private int pid;
private String pcode;
private List<Integer> pdims;
private Set<String> colours;
private Map<String,Integer> pinfo;
}
