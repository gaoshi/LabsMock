package com.pub.labs.libs;

import java.util.List;

import scala.collection.generic.ImmutableMapFactory;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

public class GuavaFresh {
	public static void main(String[] args) {
		Maps.newHashMap();
		List<String> listContainor = Lists.newArrayList();
		ImmutableList<String> of = ImmutableList.of("a", "b", "c", "d");
	}
}
