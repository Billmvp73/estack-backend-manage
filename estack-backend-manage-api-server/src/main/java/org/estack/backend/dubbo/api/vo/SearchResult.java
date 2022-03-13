package org.estack.backend.dubbo.api.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SearchResult {
    private Integer totalPage;
//    private List<HouseData> list;
    private Set<String> howWord;
}
