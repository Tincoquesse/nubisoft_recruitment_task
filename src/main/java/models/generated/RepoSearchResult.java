
package models.generated;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "total_count",
    "incomplete_results",
    "items"
})
@Generated("jsonschema2pojo")
public class RepoSearchResult {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("total_count")
    @NotNull
    private Integer totalCount;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("incomplete_results")
    @NotNull
    private Boolean incompleteResults;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("items")
    @Valid
    @NotNull
    private List<RepoSearchResultItem> items = new ArrayList<RepoSearchResultItem>();
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public RepoSearchResult() {
    }

    public RepoSearchResult(Integer totalCount, Boolean incompleteResults, List<RepoSearchResultItem> items) {
        super();
        this.totalCount = totalCount;
        this.incompleteResults = incompleteResults;
        this.items = items;
    }

    public static RepoSearchResult.RepoSearchResultBuilderBase builder() {
        return new RepoSearchResult.RepoSearchResultBuilder();
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("total_count")
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("total_count")
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("incomplete_results")
    public Boolean getIncompleteResults() {
        return incompleteResults;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("incomplete_results")
    public void setIncompleteResults(Boolean incompleteResults) {
        this.incompleteResults = incompleteResults;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("items")
    public List<RepoSearchResultItem> getItems() {
        return items;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("items")
    public void setItems(List<RepoSearchResultItem> items) {
        this.items = items;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RepoSearchResult.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("totalCount");
        sb.append('=');
        sb.append(((this.totalCount == null)?"<null>":this.totalCount));
        sb.append(',');
        sb.append("incompleteResults");
        sb.append('=');
        sb.append(((this.incompleteResults == null)?"<null>":this.incompleteResults));
        sb.append(',');
        sb.append("items");
        sb.append('=');
        sb.append(((this.items == null)?"<null>":this.items));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.incompleteResults == null)? 0 :this.incompleteResults.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.totalCount == null)? 0 :this.totalCount.hashCode()));
        result = ((result* 31)+((this.items == null)? 0 :this.items.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RepoSearchResult) == false) {
            return false;
        }
        RepoSearchResult rhs = ((RepoSearchResult) other);
        return (((((this.incompleteResults == rhs.incompleteResults)||((this.incompleteResults!= null)&&this.incompleteResults.equals(rhs.incompleteResults)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.totalCount == rhs.totalCount)||((this.totalCount!= null)&&this.totalCount.equals(rhs.totalCount))))&&((this.items == rhs.items)||((this.items!= null)&&this.items.equals(rhs.items))));
    }

    public static class RepoSearchResultBuilder
        extends RepoSearchResult.RepoSearchResultBuilderBase<RepoSearchResult>
    {


        public RepoSearchResultBuilder() {
            super();
        }

        public RepoSearchResultBuilder(Integer totalCount, Boolean incompleteResults, List<RepoSearchResultItem> items) {
            super(totalCount, incompleteResults, items);
        }

    }

    public static abstract class RepoSearchResultBuilderBase<T extends RepoSearchResult >{

        protected T instance;

        @SuppressWarnings("unchecked")
        public RepoSearchResultBuilderBase() {
            // Skip initialization when called from subclass
            if (this.getClass().equals(RepoSearchResult.RepoSearchResultBuilder.class)) {
                this.instance = ((T) new RepoSearchResult());
            }
        }

        @SuppressWarnings("unchecked")
        public RepoSearchResultBuilderBase(Integer totalCount, Boolean incompleteResults, List<RepoSearchResultItem> items) {
            // Skip initialization when called from subclass
            if (this.getClass().equals(RepoSearchResult.RepoSearchResultBuilder.class)) {
                this.instance = ((T) new RepoSearchResult(totalCount, incompleteResults, items));
            }
        }

        public T build() {
            T result;
            result = this.instance;
            this.instance = null;
            return result;
        }

        public RepoSearchResult.RepoSearchResultBuilderBase withTotalCount(Integer totalCount) {
            ((RepoSearchResult) this.instance).totalCount = totalCount;
            return this;
        }

        public RepoSearchResult.RepoSearchResultBuilderBase withIncompleteResults(Boolean incompleteResults) {
            ((RepoSearchResult) this.instance).incompleteResults = incompleteResults;
            return this;
        }

        public RepoSearchResult.RepoSearchResultBuilderBase withItems(List<RepoSearchResultItem> items) {
            ((RepoSearchResult) this.instance).items = items;
            return this;
        }

        public RepoSearchResult.RepoSearchResultBuilderBase withAdditionalProperty(String name, Object value) {
            ((RepoSearchResult) this.instance).additionalProperties.put(name, value);
            return this;
        }

    }

}
