package com.example.demo.constant;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

@NoArgsConstructor(access = AccessLevel.NONE)
public class Utils {
  public static PageRequest createPaging(Integer page, Integer size, String orderBy) {
    if (page == null || page < 0) page = Configs.DEFAULT_OFFSET;
    if (size == null || size < 0) size = Configs.DEFAULT_LIMIT;
    return PageRequest.of(page, size, Sort.Direction.DESC, orderBy);
  }
}
