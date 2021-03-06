/**
 * Copyright © 2018 FINBOURNE TECHNOLOGY LTD
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to
 * deal in the Software without restriction, including without limitation the
 * rights to use, copy, modify, merge, publish, distribute, sublicense, and/or
 * sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS
 * IN THE SOFTWARE.
 */

package com.finbourne.models;

import org.joda.time.DateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The PortfolioDto model.
 */
public class PortfolioDto {
    /**
     * Link to retrieve the current entity.
     */
    @JsonProperty(value = "href")
    private String href;

    /**
     * Identifier for the portfolio.
     */
    @JsonProperty(value = "id")
    private ResourceId id;

    /**
     * Name of the portfolio.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Portfolio creation time in UTC.
     */
    @JsonProperty(value = "created")
    private DateTime created;

    /**
     * If this is a derived portfolio, the identifier of the portfolio from
     * which it is derived.
     */
    @JsonProperty(value = "parentPortfolioId")
    private ResourceId parentPortfolioId;

    /**
     * The version of the portfolio.
     */
    @JsonProperty(value = "version")
    private VersionDto version;

    /**
     * The _links property.
     */
    @JsonProperty(value = "_links")
    private List<Link> _links;

    /**
     * Get link to retrieve the current entity.
     *
     * @return the href value
     */
    public String href() {
        return this.href;
    }

    /**
     * Set link to retrieve the current entity.
     *
     * @param href the href value to set
     * @return the PortfolioDto object itself.
     */
    public PortfolioDto withHref(String href) {
        this.href = href;
        return this;
    }

    /**
     * Get identifier for the portfolio.
     *
     * @return the id value
     */
    public ResourceId id() {
        return this.id;
    }

    /**
     * Set identifier for the portfolio.
     *
     * @param id the id value to set
     * @return the PortfolioDto object itself.
     */
    public PortfolioDto withId(ResourceId id) {
        this.id = id;
        return this;
    }

    /**
     * Get name of the portfolio.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set name of the portfolio.
     *
     * @param name the name value to set
     * @return the PortfolioDto object itself.
     */
    public PortfolioDto withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get portfolio creation time in UTC.
     *
     * @return the created value
     */
    public DateTime created() {
        return this.created;
    }

    /**
     * Set portfolio creation time in UTC.
     *
     * @param created the created value to set
     * @return the PortfolioDto object itself.
     */
    public PortfolioDto withCreated(DateTime created) {
        this.created = created;
        return this;
    }

    /**
     * Get if this is a derived portfolio, the identifier of the portfolio from which it is derived.
     *
     * @return the parentPortfolioId value
     */
    public ResourceId parentPortfolioId() {
        return this.parentPortfolioId;
    }

    /**
     * Set if this is a derived portfolio, the identifier of the portfolio from which it is derived.
     *
     * @param parentPortfolioId the parentPortfolioId value to set
     * @return the PortfolioDto object itself.
     */
    public PortfolioDto withParentPortfolioId(ResourceId parentPortfolioId) {
        this.parentPortfolioId = parentPortfolioId;
        return this;
    }

    /**
     * Get the version of the portfolio.
     *
     * @return the version value
     */
    public VersionDto version() {
        return this.version;
    }

    /**
     * Set the version of the portfolio.
     *
     * @param version the version value to set
     * @return the PortfolioDto object itself.
     */
    public PortfolioDto withVersion(VersionDto version) {
        this.version = version;
        return this;
    }

    /**
     * Get the _links value.
     *
     * @return the _links value
     */
    public List<Link> _links() {
        return this._links;
    }

    /**
     * Set the _links value.
     *
     * @param _links the _links value to set
     * @return the PortfolioDto object itself.
     */
    public PortfolioDto with_links(List<Link> _links) {
        this._links = _links;
        return this;
    }

}
