// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package fixtures.xml.models;

import com.azure.core.implementation.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * A slide in a slideshow.
 */
@JacksonXmlRootElement(localName = "Slide")
@Fluent
public final class Slide {
    /*
     * The type property.
     */
    @JacksonXmlProperty(localName = "type", isAttribute = true)
    private String type;

    /*
     * The title property.
     */
    @JsonProperty(value = "title")
    private String title;

    /*
     * The items property.
     */
    @JsonProperty("item")
    private List<String> items = new ArrayList<>();

    /**
     * Get the type property: The type property.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: The type property.
     *
     * @param type the type value to set.
     * @return the Slide object itself.
     */
    public Slide type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the title property: The title property.
     *
     * @return the title value.
     */
    public String title() {
        return this.title;
    }

    /**
     * Set the title property: The title property.
     *
     * @param title the title value to set.
     * @return the Slide object itself.
     */
    public Slide title(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get the items property: The items property.
     *
     * @return the items value.
     */
    public List<String> items() {
        return this.items;
    }

    /**
     * Set the items property: The items property.
     *
     * @param items the items value to set.
     * @return the Slide object itself.
     */
    public Slide items(List<String> items) {
        this.items = items;
        return this;
    }
}