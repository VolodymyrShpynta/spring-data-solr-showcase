/*
 * Copyright 2012 - 2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.data.solr.showcase.product.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.geo.GeoLocation;
import org.springframework.data.solr.core.mapping.Indexed;
import org.springframework.data.solr.core.mapping.SolrDocument;
import org.springframework.data.solr.showcase.product.SearchableProductDefinition;

/**
 * @author Christoph Strobl
 */
@Getter
@Setter
@ToString
@SolrDocument(solrCoreName = "collection1")
public class Product implements SearchableProductDefinition {

	private @Id @Indexed String id;

	private @Indexed(NAME_FIELD_NAME) String name;

	private @Indexed(AVAILABLE_FIELD_NAME) boolean available;

	private @Indexed List<String> features;

	private @Indexed(PRICE_FIELD_NAME) Float price;

	private @Indexed(CATEGORIES_FIELD_NAME) List<String> categories;

	private @Indexed Integer popularity;

	private @Indexed(LOCATION_FIELD_NAME) GeoLocation location;
}
