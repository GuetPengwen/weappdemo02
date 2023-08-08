package com.example.weappdemo02.bean;

import java.io.Serializable;

public class Product implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.id
     *
     * @mbg.generated Thu Aug 03 17:25:04 CST 2023
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.src
     *
     * @mbg.generated Thu Aug 03 17:25:04 CST 2023
     */
    private String src;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.title
     *
     * @mbg.generated Thu Aug 03 17:25:04 CST 2023
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.secondTitle
     *
     * @mbg.generated Thu Aug 03 17:25:04 CST 2023
     */
    private String secondtitle;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.price
     *
     * @mbg.generated Thu Aug 03 17:25:04 CST 2023
     */
    private Float price;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.image_one
     *
     * @mbg.generated Thu Aug 03 17:25:04 CST 2023
     */
    private String imageOne;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.image_two
     *
     * @mbg.generated Thu Aug 03 17:25:04 CST 2023
     */
    private String imageTwo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.image_three
     *
     * @mbg.generated Thu Aug 03 17:25:04 CST 2023
     */
    private String imageThree;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.product_detail
     *
     * @mbg.generated Thu Aug 03 17:25:04 CST 2023
     */
    private String productDetail;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.product_parameter
     *
     * @mbg.generated Thu Aug 03 17:25:04 CST 2023
     */
    private String productParameter;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.detail_height
     *
     * @mbg.generated Thu Aug 03 17:25:04 CST 2023
     */
    private Integer detailHeight;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.parameter_height
     *
     * @mbg.generated Thu Aug 03 17:25:04 CST 2023
     */
    private Integer parameterHeight;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table product
     *
     * @mbg.generated Thu Aug 03 17:25:04 CST 2023
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.id
     *
     * @return the value of product.id
     *
     * @mbg.generated Thu Aug 03 17:25:04 CST 2023
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Thu Aug 03 17:25:04 CST 2023
     */
    public Product withId(Integer id) {
        this.setId(id);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.id
     *
     * @param id the value for product.id
     *
     * @mbg.generated Thu Aug 03 17:25:04 CST 2023
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.src
     *
     * @return the value of product.src
     *
     * @mbg.generated Thu Aug 03 17:25:04 CST 2023
     */
    public String getSrc() {
        return src;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Thu Aug 03 17:25:04 CST 2023
     */
    public Product withSrc(String src) {
        this.setSrc(src);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.src
     *
     * @param src the value for product.src
     *
     * @mbg.generated Thu Aug 03 17:25:04 CST 2023
     */
    public void setSrc(String src) {
        this.src = src == null ? null : src.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.title
     *
     * @return the value of product.title
     *
     * @mbg.generated Thu Aug 03 17:25:04 CST 2023
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Thu Aug 03 17:25:04 CST 2023
     */
    public Product withTitle(String title) {
        this.setTitle(title);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.title
     *
     * @param title the value for product.title
     *
     * @mbg.generated Thu Aug 03 17:25:04 CST 2023
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.secondTitle
     *
     * @return the value of product.secondTitle
     *
     * @mbg.generated Thu Aug 03 17:25:04 CST 2023
     */
    public String getSecondtitle() {
        return secondtitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Thu Aug 03 17:25:04 CST 2023
     */
    public Product withSecondtitle(String secondtitle) {
        this.setSecondtitle(secondtitle);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.secondTitle
     *
     * @param secondtitle the value for product.secondTitle
     *
     * @mbg.generated Thu Aug 03 17:25:04 CST 2023
     */
    public void setSecondtitle(String secondtitle) {
        this.secondtitle = secondtitle == null ? null : secondtitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.price
     *
     * @return the value of product.price
     *
     * @mbg.generated Thu Aug 03 17:25:04 CST 2023
     */
    public Float getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Thu Aug 03 17:25:04 CST 2023
     */
    public Product withPrice(Float price) {
        this.setPrice(price);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.price
     *
     * @param price the value for product.price
     *
     * @mbg.generated Thu Aug 03 17:25:04 CST 2023
     */
    public void setPrice(Float price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.image_one
     *
     * @return the value of product.image_one
     *
     * @mbg.generated Thu Aug 03 17:25:04 CST 2023
     */
    public String getImageOne() {
        return imageOne;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Thu Aug 03 17:25:04 CST 2023
     */
    public Product withImageOne(String imageOne) {
        this.setImageOne(imageOne);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.image_one
     *
     * @param imageOne the value for product.image_one
     *
     * @mbg.generated Thu Aug 03 17:25:04 CST 2023
     */
    public void setImageOne(String imageOne) {
        this.imageOne = imageOne == null ? null : imageOne.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.image_two
     *
     * @return the value of product.image_two
     *
     * @mbg.generated Thu Aug 03 17:25:04 CST 2023
     */
    public String getImageTwo() {
        return imageTwo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Thu Aug 03 17:25:04 CST 2023
     */
    public Product withImageTwo(String imageTwo) {
        this.setImageTwo(imageTwo);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.image_two
     *
     * @param imageTwo the value for product.image_two
     *
     * @mbg.generated Thu Aug 03 17:25:04 CST 2023
     */
    public void setImageTwo(String imageTwo) {
        this.imageTwo = imageTwo == null ? null : imageTwo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.image_three
     *
     * @return the value of product.image_three
     *
     * @mbg.generated Thu Aug 03 17:25:04 CST 2023
     */
    public String getImageThree() {
        return imageThree;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Thu Aug 03 17:25:04 CST 2023
     */
    public Product withImageThree(String imageThree) {
        this.setImageThree(imageThree);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.image_three
     *
     * @param imageThree the value for product.image_three
     *
     * @mbg.generated Thu Aug 03 17:25:04 CST 2023
     */
    public void setImageThree(String imageThree) {
        this.imageThree = imageThree == null ? null : imageThree.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.product_detail
     *
     * @return the value of product.product_detail
     *
     * @mbg.generated Thu Aug 03 17:25:04 CST 2023
     */
    public String getProductDetail() {
        return productDetail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Thu Aug 03 17:25:04 CST 2023
     */
    public Product withProductDetail(String productDetail) {
        this.setProductDetail(productDetail);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.product_detail
     *
     * @param productDetail the value for product.product_detail
     *
     * @mbg.generated Thu Aug 03 17:25:04 CST 2023
     */
    public void setProductDetail(String productDetail) {
        this.productDetail = productDetail == null ? null : productDetail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.product_parameter
     *
     * @return the value of product.product_parameter
     *
     * @mbg.generated Thu Aug 03 17:25:04 CST 2023
     */
    public String getProductParameter() {
        return productParameter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Thu Aug 03 17:25:04 CST 2023
     */
    public Product withProductParameter(String productParameter) {
        this.setProductParameter(productParameter);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.product_parameter
     *
     * @param productParameter the value for product.product_parameter
     *
     * @mbg.generated Thu Aug 03 17:25:04 CST 2023
     */
    public void setProductParameter(String productParameter) {
        this.productParameter = productParameter == null ? null : productParameter.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.detail_height
     *
     * @return the value of product.detail_height
     *
     * @mbg.generated Thu Aug 03 17:25:04 CST 2023
     */
    public Integer getDetailHeight() {
        return detailHeight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Thu Aug 03 17:25:04 CST 2023
     */
    public Product withDetailHeight(Integer detailHeight) {
        this.setDetailHeight(detailHeight);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.detail_height
     *
     * @param detailHeight the value for product.detail_height
     *
     * @mbg.generated Thu Aug 03 17:25:04 CST 2023
     */
    public void setDetailHeight(Integer detailHeight) {
        this.detailHeight = detailHeight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.parameter_height
     *
     * @return the value of product.parameter_height
     *
     * @mbg.generated Thu Aug 03 17:25:04 CST 2023
     */
    public Integer getParameterHeight() {
        return parameterHeight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Thu Aug 03 17:25:04 CST 2023
     */
    public Product withParameterHeight(Integer parameterHeight) {
        this.setParameterHeight(parameterHeight);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.parameter_height
     *
     * @param parameterHeight the value for product.parameter_height
     *
     * @mbg.generated Thu Aug 03 17:25:04 CST 2023
     */
    public void setParameterHeight(Integer parameterHeight) {
        this.parameterHeight = parameterHeight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Thu Aug 03 17:25:04 CST 2023
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", src=").append(src);
        sb.append(", title=").append(title);
        sb.append(", secondtitle=").append(secondtitle);
        sb.append(", price=").append(price);
        sb.append(", imageOne=").append(imageOne);
        sb.append(", imageTwo=").append(imageTwo);
        sb.append(", imageThree=").append(imageThree);
        sb.append(", productDetail=").append(productDetail);
        sb.append(", productParameter=").append(productParameter);
        sb.append(", detailHeight=").append(detailHeight);
        sb.append(", parameterHeight=").append(parameterHeight);
        sb.append("]");
        return sb.toString();
    }
}