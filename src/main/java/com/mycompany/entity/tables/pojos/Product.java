/*
 * This file is generated by jOOQ.
 */
package com.mycompany.entity.tables.pojos;


import java.io.Serializable;

import javax.annotation.processing.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.14.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Entity
@Table(
    name = "PRODUCT"
)
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long    id;
    private Long    brandId;
    private Long    categoryId;
    private Integer companyId;
    private String  country;

    public Product() {}

    public Product(Product value) {
        this.id = value.id;
        this.brandId = value.brandId;
        this.categoryId = value.categoryId;
        this.companyId = value.companyId;
        this.country = value.country;
    }

    public Product(
        Long    id,
        Long    brandId,
        Long    categoryId,
        Integer companyId,
        String  country
    ) {
        this.id = id;
        this.brandId = brandId;
        this.categoryId = categoryId;
        this.companyId = companyId;
        this.country = country;
    }

    /**
     * Getter for <code>PRODUCT.ID</code>.
     */
    @Column(name = "ID", nullable = false, precision = 19)
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for <code>PRODUCT.ID</code>.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Getter for <code>PRODUCT.BRAND_ID</code>.
     */
    @Column(name = "BRAND_ID", nullable = false, precision = 19)
    public Long getBrandId() {
        return this.brandId;
    }

    /**
     * Setter for <code>PRODUCT.BRAND_ID</code>.
     */
    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    /**
     * Getter for <code>PRODUCT.CATEGORY_ID</code>.
     */
    @Column(name = "CATEGORY_ID", nullable = false, precision = 19)
    public Long getCategoryId() {
        return this.categoryId;
    }

    /**
     * Setter for <code>PRODUCT.CATEGORY_ID</code>.
     */
    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * Getter for <code>PRODUCT.COMPANY_ID</code>.
     */
    @Column(name = "COMPANY_ID", nullable = false, precision = 10)
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for <code>PRODUCT.COMPANY_ID</code>.
     */
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    /**
     * Getter for <code>PRODUCT.COUNTRY</code>.
     */
    @Column(name = "COUNTRY", length = 255)
    public String getCountry() {
        return this.country;
    }

    /**
     * Setter for <code>PRODUCT.COUNTRY</code>.
     */
    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Product other = (Product) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        if (brandId == null) {
            if (other.brandId != null)
                return false;
        }
        else if (!brandId.equals(other.brandId))
            return false;
        if (categoryId == null) {
            if (other.categoryId != null)
                return false;
        }
        else if (!categoryId.equals(other.categoryId))
            return false;
        if (companyId == null) {
            if (other.companyId != null)
                return false;
        }
        else if (!companyId.equals(other.companyId))
            return false;
        if (country == null) {
            if (other.country != null)
                return false;
        }
        else if (!country.equals(other.country))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.brandId == null) ? 0 : this.brandId.hashCode());
        result = prime * result + ((this.categoryId == null) ? 0 : this.categoryId.hashCode());
        result = prime * result + ((this.companyId == null) ? 0 : this.companyId.hashCode());
        result = prime * result + ((this.country == null) ? 0 : this.country.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Product (");

        sb.append(id);
        sb.append(", ").append(brandId);
        sb.append(", ").append(categoryId);
        sb.append(", ").append(companyId);
        sb.append(", ").append(country);

        sb.append(")");
        return sb.toString();
    }
}
