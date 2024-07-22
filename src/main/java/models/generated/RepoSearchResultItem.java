
package models.generated;

import java.math.BigDecimal;
import java.net.URI;
import java.time.ZonedDateTime;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;


/**
 * Repo Search Result Item
 * <p>
 * Repo Search Result Item
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "node_id",
    "name",
    "full_name",
    "owner",
    "private",
    "html_url",
    "description",
    "fork",
    "url",
    "created_at",
    "updated_at",
    "pushed_at",
    "homepage",
    "size",
    "stargazers_count",
    "watchers_count",
    "language",
    "forks_count",
    "open_issues_count",
    "master_branch",
    "default_branch",
    "score",
    "forks_url",
    "keys_url",
    "collaborators_url",
    "teams_url",
    "hooks_url",
    "issue_events_url",
    "events_url",
    "assignees_url",
    "branches_url",
    "tags_url",
    "blobs_url",
    "git_tags_url",
    "git_refs_url",
    "trees_url",
    "statuses_url",
    "languages_url",
    "stargazers_url",
    "contributors_url",
    "subscribers_url",
    "subscription_url",
    "commits_url",
    "git_commits_url",
    "comments_url",
    "issue_comment_url",
    "contents_url",
    "compare_url",
    "merges_url",
    "archive_url",
    "downloads_url",
    "issues_url",
    "pulls_url",
    "milestones_url",
    "notifications_url",
    "labels_url",
    "releases_url",
    "deployments_url"
})
@Generated("jsonschema2pojo")
public class RepoSearchResultItem {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    @NotNull
    private Integer id;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("node_id")
    @NotNull
    private String nodeId;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    @NotNull
    private String name;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("full_name")
    @NotNull
    private String fullName;
    /**
     * Simple User
     * <p>
     * A GitHub user.
     * 
     */
    @JsonProperty("owner")
    @JsonPropertyDescription("A GitHub user.")
    @Valid
    private SimpleUser owner;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("private")
    @NotNull
    private Boolean _private;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("html_url")
    @NotNull
    private URI htmlUrl;
    @JsonProperty("description")
    private String description;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("fork")
    @NotNull
    private Boolean fork;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("url")
    @NotNull
    private URI url;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("created_at")
    @NotNull
    private ZonedDateTime createdAt;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("updated_at")
    @NotNull
    private ZonedDateTime updatedAt;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("pushed_at")
    @NotNull
    private ZonedDateTime pushedAt;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("homepage")
    @NotNull
    private URI homepage;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("size")
    @NotNull
    private Integer size;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("stargazers_count")
    @NotNull
    private Integer stargazersCount;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("watchers_count")
    @NotNull
    private Integer watchersCount;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("language")
    @NotNull
    private String language;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("forks_count")
    @NotNull
    private Integer forksCount;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("open_issues_count")
    @NotNull
    private Integer openIssuesCount;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("master_branch")
    @NotNull
    private String masterBranch;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("default_branch")
    @NotNull
    private String defaultBranch;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("score")
    @NotNull
    private BigDecimal score;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("forks_url")
    @NotNull
    private URI forksUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("keys_url")
    @NotNull
    private String keysUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("collaborators_url")
    @NotNull
    private String collaboratorsUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("teams_url")
    @NotNull
    private String teamsUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("hooks_url")
    @NotNull
    private String hooksUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("issue_events_url")
    @NotNull
    private String issueEventsUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("events_url")
    @NotNull
    private String eventsUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("assignees_url")
    @NotNull
    private String assigneesUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("branches_url")
    @NotNull
    private String branchesUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("tags_url")
    @NotNull
    private String tagsUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("blobs_url")
    @NotNull
    private String blobsUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("git_tags_url")
    @NotNull
    private String gitTagsUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("git_refs_url")
    @NotNull
    private String gitRefsUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("trees_url")
    @NotNull
    private String treesUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("statuses_url")
    @NotNull
    private String statusesUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("languages_url")
    @NotNull
    private String languagesUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("stargazers_url")
    @NotNull
    private String stargazersUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("contributors_url")
    @NotNull
    private String contributorsUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("subscribers_url")
    @NotNull
    private String subscribersUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("subscription_url")
    @NotNull
    private String subscriptionUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("commits_url")
    @NotNull
    private String commitsUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("git_commits_url")
    @NotNull
    private String gitCommitsUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("comments_url")
    @NotNull
    private String commentsUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("issue_comment_url")
    @NotNull
    private String issueCommentUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("contents_url")
    @NotNull
    private String contentsUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("compare_url")
    @NotNull
    private String compareUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("merges_url")
    @NotNull
    private String mergesUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("archive_url")
    @NotNull
    private String archiveUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("downloads_url")
    @NotNull
    private String downloadsUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("issues_url")
    @NotNull
    private String issuesUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("pulls_url")
    @NotNull
    private String pullsUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("milestones_url")
    @NotNull
    private String milestonesUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("notifications_url")
    @NotNull
    private String notificationsUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("labels_url")
    @NotNull
    private String labelsUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("releases_url")
    @NotNull
    private String releasesUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("deployments_url")
    @NotNull
    private String deploymentsUrl;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public RepoSearchResultItem() {
    }

    /**
     * 
     * @param owner
     *     Simple User. A GitHub user.
     */
    public RepoSearchResultItem(Integer id, String nodeId, String name, String fullName, SimpleUser owner, Boolean _private, URI htmlUrl, String description, Boolean fork, URI url, ZonedDateTime createdAt, ZonedDateTime updatedAt, ZonedDateTime pushedAt, URI homepage, Integer size, Integer stargazersCount, Integer watchersCount, String language, Integer forksCount, Integer openIssuesCount, String masterBranch, String defaultBranch, BigDecimal score, URI forksUrl, String keysUrl, String collaboratorsUrl, String teamsUrl, String hooksUrl, String issueEventsUrl, String eventsUrl, String assigneesUrl, String branchesUrl, String tagsUrl, String blobsUrl, String gitTagsUrl, String gitRefsUrl, String treesUrl, String statusesUrl, String languagesUrl, String stargazersUrl, String contributorsUrl, String subscribersUrl, String subscriptionUrl, String commitsUrl, String gitCommitsUrl, String commentsUrl, String issueCommentUrl, String contentsUrl, String compareUrl, String mergesUrl, String archiveUrl, String downloadsUrl, String issuesUrl, String pullsUrl, String milestonesUrl, String notificationsUrl, String labelsUrl, String releasesUrl, String deploymentsUrl) {
        super();
        this.id = id;
        this.nodeId = nodeId;
        this.name = name;
        this.fullName = fullName;
        this.owner = owner;
        this._private = _private;
        this.htmlUrl = htmlUrl;
        this.description = description;
        this.fork = fork;
        this.url = url;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.pushedAt = pushedAt;
        this.homepage = homepage;
        this.size = size;
        this.stargazersCount = stargazersCount;
        this.watchersCount = watchersCount;
        this.language = language;
        this.forksCount = forksCount;
        this.openIssuesCount = openIssuesCount;
        this.masterBranch = masterBranch;
        this.defaultBranch = defaultBranch;
        this.score = score;
        this.forksUrl = forksUrl;
        this.keysUrl = keysUrl;
        this.collaboratorsUrl = collaboratorsUrl;
        this.teamsUrl = teamsUrl;
        this.hooksUrl = hooksUrl;
        this.issueEventsUrl = issueEventsUrl;
        this.eventsUrl = eventsUrl;
        this.assigneesUrl = assigneesUrl;
        this.branchesUrl = branchesUrl;
        this.tagsUrl = tagsUrl;
        this.blobsUrl = blobsUrl;
        this.gitTagsUrl = gitTagsUrl;
        this.gitRefsUrl = gitRefsUrl;
        this.treesUrl = treesUrl;
        this.statusesUrl = statusesUrl;
        this.languagesUrl = languagesUrl;
        this.stargazersUrl = stargazersUrl;
        this.contributorsUrl = contributorsUrl;
        this.subscribersUrl = subscribersUrl;
        this.subscriptionUrl = subscriptionUrl;
        this.commitsUrl = commitsUrl;
        this.gitCommitsUrl = gitCommitsUrl;
        this.commentsUrl = commentsUrl;
        this.issueCommentUrl = issueCommentUrl;
        this.contentsUrl = contentsUrl;
        this.compareUrl = compareUrl;
        this.mergesUrl = mergesUrl;
        this.archiveUrl = archiveUrl;
        this.downloadsUrl = downloadsUrl;
        this.issuesUrl = issuesUrl;
        this.pullsUrl = pullsUrl;
        this.milestonesUrl = milestonesUrl;
        this.notificationsUrl = notificationsUrl;
        this.labelsUrl = labelsUrl;
        this.releasesUrl = releasesUrl;
        this.deploymentsUrl = deploymentsUrl;
    }

    public static RepoSearchResultItem.RepoSearchResultItemBuilderBase builder() {
        return new RepoSearchResultItem.RepoSearchResultItemBuilder();
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("node_id")
    public String getNodeId() {
        return nodeId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("node_id")
    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("full_name")
    public String getFullName() {
        return fullName;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("full_name")
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * Simple User
     * <p>
     * A GitHub user.
     * 
     */
    @JsonProperty("owner")
    public SimpleUser getOwner() {
        return owner;
    }

    /**
     * Simple User
     * <p>
     * A GitHub user.
     * 
     */
    @JsonProperty("owner")
    public void setOwner(SimpleUser owner) {
        this.owner = owner;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("private")
    public Boolean getPrivate() {
        return _private;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("private")
    public void setPrivate(Boolean _private) {
        this._private = _private;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("html_url")
    public URI getHtmlUrl() {
        return htmlUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("html_url")
    public void setHtmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("fork")
    public Boolean getFork() {
        return fork;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("fork")
    public void setFork(Boolean fork) {
        this.fork = fork;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("url")
    public URI getUrl() {
        return url;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("url")
    public void setUrl(URI url) {
        this.url = url;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("created_at")
    public ZonedDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("created_at")
    public void setCreatedAt(ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("updated_at")
    public ZonedDateTime getUpdatedAt() {
        return updatedAt;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("updated_at")
    public void setUpdatedAt(ZonedDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("pushed_at")
    public ZonedDateTime getPushedAt() {
        return pushedAt;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("pushed_at")
    public void setPushedAt(ZonedDateTime pushedAt) {
        this.pushedAt = pushedAt;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("homepage")
    public URI getHomepage() {
        return homepage;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("homepage")
    public void setHomepage(URI homepage) {
        this.homepage = homepage;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("size")
    public Integer getSize() {
        return size;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("size")
    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("stargazers_count")
    public Integer getStargazersCount() {
        return stargazersCount;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("stargazers_count")
    public void setStargazersCount(Integer stargazersCount) {
        this.stargazersCount = stargazersCount;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("watchers_count")
    public Integer getWatchersCount() {
        return watchersCount;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("watchers_count")
    public void setWatchersCount(Integer watchersCount) {
        this.watchersCount = watchersCount;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("language")
    public String getLanguage() {
        return language;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("language")
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("forks_count")
    public Integer getForksCount() {
        return forksCount;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("forks_count")
    public void setForksCount(Integer forksCount) {
        this.forksCount = forksCount;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("open_issues_count")
    public Integer getOpenIssuesCount() {
        return openIssuesCount;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("open_issues_count")
    public void setOpenIssuesCount(Integer openIssuesCount) {
        this.openIssuesCount = openIssuesCount;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("master_branch")
    public String getMasterBranch() {
        return masterBranch;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("master_branch")
    public void setMasterBranch(String masterBranch) {
        this.masterBranch = masterBranch;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("default_branch")
    public String getDefaultBranch() {
        return defaultBranch;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("default_branch")
    public void setDefaultBranch(String defaultBranch) {
        this.defaultBranch = defaultBranch;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("score")
    public BigDecimal getScore() {
        return score;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("score")
    public void setScore(BigDecimal score) {
        this.score = score;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("forks_url")
    public URI getForksUrl() {
        return forksUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("forks_url")
    public void setForksUrl(URI forksUrl) {
        this.forksUrl = forksUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("keys_url")
    public String getKeysUrl() {
        return keysUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("keys_url")
    public void setKeysUrl(String keysUrl) {
        this.keysUrl = keysUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("collaborators_url")
    public String getCollaboratorsUrl() {
        return collaboratorsUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("collaborators_url")
    public void setCollaboratorsUrl(String collaboratorsUrl) {
        this.collaboratorsUrl = collaboratorsUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("teams_url")
    public String getTeamsUrl() {
        return teamsUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("teams_url")
    public void setTeamsUrl(String teamsUrl) {
        this.teamsUrl = teamsUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("hooks_url")
    public String getHooksUrl() {
        return hooksUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("hooks_url")
    public void setHooksUrl(String hooksUrl) {
        this.hooksUrl = hooksUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("issue_events_url")
    public String getIssueEventsUrl() {
        return issueEventsUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("issue_events_url")
    public void setIssueEventsUrl(String issueEventsUrl) {
        this.issueEventsUrl = issueEventsUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("events_url")
    public String getEventsUrl() {
        return eventsUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("events_url")
    public void setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("assignees_url")
    public String getAssigneesUrl() {
        return assigneesUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("assignees_url")
    public void setAssigneesUrl(String assigneesUrl) {
        this.assigneesUrl = assigneesUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("branches_url")
    public String getBranchesUrl() {
        return branchesUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("branches_url")
    public void setBranchesUrl(String branchesUrl) {
        this.branchesUrl = branchesUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("tags_url")
    public String getTagsUrl() {
        return tagsUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("tags_url")
    public void setTagsUrl(String tagsUrl) {
        this.tagsUrl = tagsUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("blobs_url")
    public String getBlobsUrl() {
        return blobsUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("blobs_url")
    public void setBlobsUrl(String blobsUrl) {
        this.blobsUrl = blobsUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("git_tags_url")
    public String getGitTagsUrl() {
        return gitTagsUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("git_tags_url")
    public void setGitTagsUrl(String gitTagsUrl) {
        this.gitTagsUrl = gitTagsUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("git_refs_url")
    public String getGitRefsUrl() {
        return gitRefsUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("git_refs_url")
    public void setGitRefsUrl(String gitRefsUrl) {
        this.gitRefsUrl = gitRefsUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("trees_url")
    public String getTreesUrl() {
        return treesUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("trees_url")
    public void setTreesUrl(String treesUrl) {
        this.treesUrl = treesUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("statuses_url")
    public String getStatusesUrl() {
        return statusesUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("statuses_url")
    public void setStatusesUrl(String statusesUrl) {
        this.statusesUrl = statusesUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("languages_url")
    public String getLanguagesUrl() {
        return languagesUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("languages_url")
    public void setLanguagesUrl(String languagesUrl) {
        this.languagesUrl = languagesUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("stargazers_url")
    public String getStargazersUrl() {
        return stargazersUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("stargazers_url")
    public void setStargazersUrl(String stargazersUrl) {
        this.stargazersUrl = stargazersUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("contributors_url")
    public String getContributorsUrl() {
        return contributorsUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("contributors_url")
    public void setContributorsUrl(String contributorsUrl) {
        this.contributorsUrl = contributorsUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("subscribers_url")
    public String getSubscribersUrl() {
        return subscribersUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("subscribers_url")
    public void setSubscribersUrl(String subscribersUrl) {
        this.subscribersUrl = subscribersUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("subscription_url")
    public String getSubscriptionUrl() {
        return subscriptionUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("subscription_url")
    public void setSubscriptionUrl(String subscriptionUrl) {
        this.subscriptionUrl = subscriptionUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("commits_url")
    public String getCommitsUrl() {
        return commitsUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("commits_url")
    public void setCommitsUrl(String commitsUrl) {
        this.commitsUrl = commitsUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("git_commits_url")
    public String getGitCommitsUrl() {
        return gitCommitsUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("git_commits_url")
    public void setGitCommitsUrl(String gitCommitsUrl) {
        this.gitCommitsUrl = gitCommitsUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("comments_url")
    public String getCommentsUrl() {
        return commentsUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("comments_url")
    public void setCommentsUrl(String commentsUrl) {
        this.commentsUrl = commentsUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("issue_comment_url")
    public String getIssueCommentUrl() {
        return issueCommentUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("issue_comment_url")
    public void setIssueCommentUrl(String issueCommentUrl) {
        this.issueCommentUrl = issueCommentUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("contents_url")
    public String getContentsUrl() {
        return contentsUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("contents_url")
    public void setContentsUrl(String contentsUrl) {
        this.contentsUrl = contentsUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("compare_url")
    public String getCompareUrl() {
        return compareUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("compare_url")
    public void setCompareUrl(String compareUrl) {
        this.compareUrl = compareUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("merges_url")
    public String getMergesUrl() {
        return mergesUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("merges_url")
    public void setMergesUrl(String mergesUrl) {
        this.mergesUrl = mergesUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("archive_url")
    public String getArchiveUrl() {
        return archiveUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("archive_url")
    public void setArchiveUrl(String archiveUrl) {
        this.archiveUrl = archiveUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("downloads_url")
    public String getDownloadsUrl() {
        return downloadsUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("downloads_url")
    public void setDownloadsUrl(String downloadsUrl) {
        this.downloadsUrl = downloadsUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("issues_url")
    public String getIssuesUrl() {
        return issuesUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("issues_url")
    public void setIssuesUrl(String issuesUrl) {
        this.issuesUrl = issuesUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("pulls_url")
    public String getPullsUrl() {
        return pullsUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("pulls_url")
    public void setPullsUrl(String pullsUrl) {
        this.pullsUrl = pullsUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("milestones_url")
    public String getMilestonesUrl() {
        return milestonesUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("milestones_url")
    public void setMilestonesUrl(String milestonesUrl) {
        this.milestonesUrl = milestonesUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("notifications_url")
    public String getNotificationsUrl() {
        return notificationsUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("notifications_url")
    public void setNotificationsUrl(String notificationsUrl) {
        this.notificationsUrl = notificationsUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("labels_url")
    public String getLabelsUrl() {
        return labelsUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("labels_url")
    public void setLabelsUrl(String labelsUrl) {
        this.labelsUrl = labelsUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("releases_url")
    public String getReleasesUrl() {
        return releasesUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("releases_url")
    public void setReleasesUrl(String releasesUrl) {
        this.releasesUrl = releasesUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("deployments_url")
    public String getDeploymentsUrl() {
        return deploymentsUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("deployments_url")
    public void setDeploymentsUrl(String deploymentsUrl) {
        this.deploymentsUrl = deploymentsUrl;
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
        sb.append(RepoSearchResultItem.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("nodeId");
        sb.append('=');
        sb.append(((this.nodeId == null)?"<null>":this.nodeId));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("fullName");
        sb.append('=');
        sb.append(((this.fullName == null)?"<null>":this.fullName));
        sb.append(',');
        sb.append("owner");
        sb.append('=');
        sb.append(((this.owner == null)?"<null>":this.owner));
        sb.append(',');
        sb.append("_private");
        sb.append('=');
        sb.append(((this._private == null)?"<null>":this._private));
        sb.append(',');
        sb.append("htmlUrl");
        sb.append('=');
        sb.append(((this.htmlUrl == null)?"<null>":this.htmlUrl));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("fork");
        sb.append('=');
        sb.append(((this.fork == null)?"<null>":this.fork));
        sb.append(',');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null)?"<null>":this.url));
        sb.append(',');
        sb.append("createdAt");
        sb.append('=');
        sb.append(((this.createdAt == null)?"<null>":this.createdAt));
        sb.append(',');
        sb.append("updatedAt");
        sb.append('=');
        sb.append(((this.updatedAt == null)?"<null>":this.updatedAt));
        sb.append(',');
        sb.append("pushedAt");
        sb.append('=');
        sb.append(((this.pushedAt == null)?"<null>":this.pushedAt));
        sb.append(',');
        sb.append("homepage");
        sb.append('=');
        sb.append(((this.homepage == null)?"<null>":this.homepage));
        sb.append(',');
        sb.append("size");
        sb.append('=');
        sb.append(((this.size == null)?"<null>":this.size));
        sb.append(',');
        sb.append("stargazersCount");
        sb.append('=');
        sb.append(((this.stargazersCount == null)?"<null>":this.stargazersCount));
        sb.append(',');
        sb.append("watchersCount");
        sb.append('=');
        sb.append(((this.watchersCount == null)?"<null>":this.watchersCount));
        sb.append(',');
        sb.append("language");
        sb.append('=');
        sb.append(((this.language == null)?"<null>":this.language));
        sb.append(',');
        sb.append("forksCount");
        sb.append('=');
        sb.append(((this.forksCount == null)?"<null>":this.forksCount));
        sb.append(',');
        sb.append("openIssuesCount");
        sb.append('=');
        sb.append(((this.openIssuesCount == null)?"<null>":this.openIssuesCount));
        sb.append(',');
        sb.append("masterBranch");
        sb.append('=');
        sb.append(((this.masterBranch == null)?"<null>":this.masterBranch));
        sb.append(',');
        sb.append("defaultBranch");
        sb.append('=');
        sb.append(((this.defaultBranch == null)?"<null>":this.defaultBranch));
        sb.append(',');
        sb.append("score");
        sb.append('=');
        sb.append(((this.score == null)?"<null>":this.score));
        sb.append(',');
        sb.append("forksUrl");
        sb.append('=');
        sb.append(((this.forksUrl == null)?"<null>":this.forksUrl));
        sb.append(',');
        sb.append("keysUrl");
        sb.append('=');
        sb.append(((this.keysUrl == null)?"<null>":this.keysUrl));
        sb.append(',');
        sb.append("collaboratorsUrl");
        sb.append('=');
        sb.append(((this.collaboratorsUrl == null)?"<null>":this.collaboratorsUrl));
        sb.append(',');
        sb.append("teamsUrl");
        sb.append('=');
        sb.append(((this.teamsUrl == null)?"<null>":this.teamsUrl));
        sb.append(',');
        sb.append("hooksUrl");
        sb.append('=');
        sb.append(((this.hooksUrl == null)?"<null>":this.hooksUrl));
        sb.append(',');
        sb.append("issueEventsUrl");
        sb.append('=');
        sb.append(((this.issueEventsUrl == null)?"<null>":this.issueEventsUrl));
        sb.append(',');
        sb.append("eventsUrl");
        sb.append('=');
        sb.append(((this.eventsUrl == null)?"<null>":this.eventsUrl));
        sb.append(',');
        sb.append("assigneesUrl");
        sb.append('=');
        sb.append(((this.assigneesUrl == null)?"<null>":this.assigneesUrl));
        sb.append(',');
        sb.append("branchesUrl");
        sb.append('=');
        sb.append(((this.branchesUrl == null)?"<null>":this.branchesUrl));
        sb.append(',');
        sb.append("tagsUrl");
        sb.append('=');
        sb.append(((this.tagsUrl == null)?"<null>":this.tagsUrl));
        sb.append(',');
        sb.append("blobsUrl");
        sb.append('=');
        sb.append(((this.blobsUrl == null)?"<null>":this.blobsUrl));
        sb.append(',');
        sb.append("gitTagsUrl");
        sb.append('=');
        sb.append(((this.gitTagsUrl == null)?"<null>":this.gitTagsUrl));
        sb.append(',');
        sb.append("gitRefsUrl");
        sb.append('=');
        sb.append(((this.gitRefsUrl == null)?"<null>":this.gitRefsUrl));
        sb.append(',');
        sb.append("treesUrl");
        sb.append('=');
        sb.append(((this.treesUrl == null)?"<null>":this.treesUrl));
        sb.append(',');
        sb.append("statusesUrl");
        sb.append('=');
        sb.append(((this.statusesUrl == null)?"<null>":this.statusesUrl));
        sb.append(',');
        sb.append("languagesUrl");
        sb.append('=');
        sb.append(((this.languagesUrl == null)?"<null>":this.languagesUrl));
        sb.append(',');
        sb.append("stargazersUrl");
        sb.append('=');
        sb.append(((this.stargazersUrl == null)?"<null>":this.stargazersUrl));
        sb.append(',');
        sb.append("contributorsUrl");
        sb.append('=');
        sb.append(((this.contributorsUrl == null)?"<null>":this.contributorsUrl));
        sb.append(',');
        sb.append("subscribersUrl");
        sb.append('=');
        sb.append(((this.subscribersUrl == null)?"<null>":this.subscribersUrl));
        sb.append(',');
        sb.append("subscriptionUrl");
        sb.append('=');
        sb.append(((this.subscriptionUrl == null)?"<null>":this.subscriptionUrl));
        sb.append(',');
        sb.append("commitsUrl");
        sb.append('=');
        sb.append(((this.commitsUrl == null)?"<null>":this.commitsUrl));
        sb.append(',');
        sb.append("gitCommitsUrl");
        sb.append('=');
        sb.append(((this.gitCommitsUrl == null)?"<null>":this.gitCommitsUrl));
        sb.append(',');
        sb.append("commentsUrl");
        sb.append('=');
        sb.append(((this.commentsUrl == null)?"<null>":this.commentsUrl));
        sb.append(',');
        sb.append("issueCommentUrl");
        sb.append('=');
        sb.append(((this.issueCommentUrl == null)?"<null>":this.issueCommentUrl));
        sb.append(',');
        sb.append("contentsUrl");
        sb.append('=');
        sb.append(((this.contentsUrl == null)?"<null>":this.contentsUrl));
        sb.append(',');
        sb.append("compareUrl");
        sb.append('=');
        sb.append(((this.compareUrl == null)?"<null>":this.compareUrl));
        sb.append(',');
        sb.append("mergesUrl");
        sb.append('=');
        sb.append(((this.mergesUrl == null)?"<null>":this.mergesUrl));
        sb.append(',');
        sb.append("archiveUrl");
        sb.append('=');
        sb.append(((this.archiveUrl == null)?"<null>":this.archiveUrl));
        sb.append(',');
        sb.append("downloadsUrl");
        sb.append('=');
        sb.append(((this.downloadsUrl == null)?"<null>":this.downloadsUrl));
        sb.append(',');
        sb.append("issuesUrl");
        sb.append('=');
        sb.append(((this.issuesUrl == null)?"<null>":this.issuesUrl));
        sb.append(',');
        sb.append("pullsUrl");
        sb.append('=');
        sb.append(((this.pullsUrl == null)?"<null>":this.pullsUrl));
        sb.append(',');
        sb.append("milestonesUrl");
        sb.append('=');
        sb.append(((this.milestonesUrl == null)?"<null>":this.milestonesUrl));
        sb.append(',');
        sb.append("notificationsUrl");
        sb.append('=');
        sb.append(((this.notificationsUrl == null)?"<null>":this.notificationsUrl));
        sb.append(',');
        sb.append("labelsUrl");
        sb.append('=');
        sb.append(((this.labelsUrl == null)?"<null>":this.labelsUrl));
        sb.append(',');
        sb.append("releasesUrl");
        sb.append('=');
        sb.append(((this.releasesUrl == null)?"<null>":this.releasesUrl));
        sb.append(',');
        sb.append("deploymentsUrl");
        sb.append('=');
        sb.append(((this.deploymentsUrl == null)?"<null>":this.deploymentsUrl));
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
        result = ((result* 31)+((this.archiveUrl == null)? 0 :this.archiveUrl.hashCode()));
        result = ((result* 31)+((this.language == null)? 0 :this.language.hashCode()));
        result = ((result* 31)+((this.languagesUrl == null)? 0 :this.languagesUrl.hashCode()));
        result = ((result* 31)+((this.assigneesUrl == null)? 0 :this.assigneesUrl.hashCode()));
        result = ((result* 31)+((this.commitsUrl == null)? 0 :this.commitsUrl.hashCode()));
        result = ((result* 31)+((this.forksCount == null)? 0 :this.forksCount.hashCode()));
        result = ((result* 31)+((this.subscribersUrl == null)? 0 :this.subscribersUrl.hashCode()));
        result = ((result* 31)+((this.createdAt == null)? 0 :this.createdAt.hashCode()));
        result = ((result* 31)+((this.score == null)? 0 :this.score.hashCode()));
        result = ((result* 31)+((this.watchersCount == null)? 0 :this.watchersCount.hashCode()));
        result = ((result* 31)+((this.forksUrl == null)? 0 :this.forksUrl.hashCode()));
        result = ((result* 31)+((this._private == null)? 0 :this._private.hashCode()));
        result = ((result* 31)+((this.masterBranch == null)? 0 :this.masterBranch.hashCode()));
        result = ((result* 31)+((this.issueCommentUrl == null)? 0 :this.issueCommentUrl.hashCode()));
        result = ((result* 31)+((this.statusesUrl == null)? 0 :this.statusesUrl.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.collaboratorsUrl == null)? 0 :this.collaboratorsUrl.hashCode()));
        result = ((result* 31)+((this.updatedAt == null)? 0 :this.updatedAt.hashCode()));
        result = ((result* 31)+((this.labelsUrl == null)? 0 :this.labelsUrl.hashCode()));
        result = ((result* 31)+((this.defaultBranch == null)? 0 :this.defaultBranch.hashCode()));
        result = ((result* 31)+((this.keysUrl == null)? 0 :this.keysUrl.hashCode()));
        result = ((result* 31)+((this.downloadsUrl == null)? 0 :this.downloadsUrl.hashCode()));
        result = ((result* 31)+((this.pushedAt == null)? 0 :this.pushedAt.hashCode()));
        result = ((result* 31)+((this.contentsUrl == null)? 0 :this.contentsUrl.hashCode()));
        result = ((result* 31)+((this.tagsUrl == null)? 0 :this.tagsUrl.hashCode()));
        result = ((result* 31)+((this.size == null)? 0 :this.size.hashCode()));
        result = ((result* 31)+((this.commentsUrl == null)? 0 :this.commentsUrl.hashCode()));
        result = ((result* 31)+((this.treesUrl == null)? 0 :this.treesUrl.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.mergesUrl == null)? 0 :this.mergesUrl.hashCode()));
        result = ((result* 31)+((this.nodeId == null)? 0 :this.nodeId.hashCode()));
        result = ((result* 31)+((this.teamsUrl == null)? 0 :this.teamsUrl.hashCode()));
        result = ((result* 31)+((this.blobsUrl == null)? 0 :this.blobsUrl.hashCode()));
        result = ((result* 31)+((this.issueEventsUrl == null)? 0 :this.issueEventsUrl.hashCode()));
        result = ((result* 31)+((this.milestonesUrl == null)? 0 :this.milestonesUrl.hashCode()));
        result = ((result* 31)+((this.issuesUrl == null)? 0 :this.issuesUrl.hashCode()));
        result = ((result* 31)+((this.releasesUrl == null)? 0 :this.releasesUrl.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.branchesUrl == null)? 0 :this.branchesUrl.hashCode()));
        result = ((result* 31)+((this.contributorsUrl == null)? 0 :this.contributorsUrl.hashCode()));
        result = ((result* 31)+((this.gitRefsUrl == null)? 0 :this.gitRefsUrl.hashCode()));
        result = ((result* 31)+((this.openIssuesCount == null)? 0 :this.openIssuesCount.hashCode()));
        result = ((result* 31)+((this.hooksUrl == null)? 0 :this.hooksUrl.hashCode()));
        result = ((result* 31)+((this.stargazersCount == null)? 0 :this.stargazersCount.hashCode()));
        result = ((result* 31)+((this.owner == null)? 0 :this.owner.hashCode()));
        result = ((result* 31)+((this.compareUrl == null)? 0 :this.compareUrl.hashCode()));
        result = ((result* 31)+((this.gitCommitsUrl == null)? 0 :this.gitCommitsUrl.hashCode()));
        result = ((result* 31)+((this.htmlUrl == null)? 0 :this.htmlUrl.hashCode()));
        result = ((result* 31)+((this.stargazersUrl == null)? 0 :this.stargazersUrl.hashCode()));
        result = ((result* 31)+((this.fullName == null)? 0 :this.fullName.hashCode()));
        result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
        result = ((result* 31)+((this.pullsUrl == null)? 0 :this.pullsUrl.hashCode()));
        result = ((result* 31)+((this.fork == null)? 0 :this.fork.hashCode()));
        result = ((result* 31)+((this.deploymentsUrl == null)? 0 :this.deploymentsUrl.hashCode()));
        result = ((result* 31)+((this.eventsUrl == null)? 0 :this.eventsUrl.hashCode()));
        result = ((result* 31)+((this.gitTagsUrl == null)? 0 :this.gitTagsUrl.hashCode()));
        result = ((result* 31)+((this.notificationsUrl == null)? 0 :this.notificationsUrl.hashCode()));
        result = ((result* 31)+((this.homepage == null)? 0 :this.homepage.hashCode()));
        result = ((result* 31)+((this.subscriptionUrl == null)? 0 :this.subscriptionUrl.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RepoSearchResultItem) == false) {
            return false;
        }
        RepoSearchResultItem rhs = ((RepoSearchResultItem) other);
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.archiveUrl == rhs.archiveUrl)||((this.archiveUrl!= null)&&this.archiveUrl.equals(rhs.archiveUrl)))&&((this.language == rhs.language)||((this.language!= null)&&this.language.equals(rhs.language))))&&((this.languagesUrl == rhs.languagesUrl)||((this.languagesUrl!= null)&&this.languagesUrl.equals(rhs.languagesUrl))))&&((this.assigneesUrl == rhs.assigneesUrl)||((this.assigneesUrl!= null)&&this.assigneesUrl.equals(rhs.assigneesUrl))))&&((this.commitsUrl == rhs.commitsUrl)||((this.commitsUrl!= null)&&this.commitsUrl.equals(rhs.commitsUrl))))&&((this.forksCount == rhs.forksCount)||((this.forksCount!= null)&&this.forksCount.equals(rhs.forksCount))))&&((this.subscribersUrl == rhs.subscribersUrl)||((this.subscribersUrl!= null)&&this.subscribersUrl.equals(rhs.subscribersUrl))))&&((this.createdAt == rhs.createdAt)||((this.createdAt!= null)&&this.createdAt.equals(rhs.createdAt))))&&((this.score == rhs.score)||((this.score!= null)&&this.score.equals(rhs.score))))&&((this.watchersCount == rhs.watchersCount)||((this.watchersCount!= null)&&this.watchersCount.equals(rhs.watchersCount))))&&((this.forksUrl == rhs.forksUrl)||((this.forksUrl!= null)&&this.forksUrl.equals(rhs.forksUrl))))&&((this._private == rhs._private)||((this._private!= null)&&this._private.equals(rhs._private))))&&((this.masterBranch == rhs.masterBranch)||((this.masterBranch!= null)&&this.masterBranch.equals(rhs.masterBranch))))&&((this.issueCommentUrl == rhs.issueCommentUrl)||((this.issueCommentUrl!= null)&&this.issueCommentUrl.equals(rhs.issueCommentUrl))))&&((this.statusesUrl == rhs.statusesUrl)||((this.statusesUrl!= null)&&this.statusesUrl.equals(rhs.statusesUrl))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.collaboratorsUrl == rhs.collaboratorsUrl)||((this.collaboratorsUrl!= null)&&this.collaboratorsUrl.equals(rhs.collaboratorsUrl))))&&((this.updatedAt == rhs.updatedAt)||((this.updatedAt!= null)&&this.updatedAt.equals(rhs.updatedAt))))&&((this.labelsUrl == rhs.labelsUrl)||((this.labelsUrl!= null)&&this.labelsUrl.equals(rhs.labelsUrl))))&&((this.defaultBranch == rhs.defaultBranch)||((this.defaultBranch!= null)&&this.defaultBranch.equals(rhs.defaultBranch))))&&((this.keysUrl == rhs.keysUrl)||((this.keysUrl!= null)&&this.keysUrl.equals(rhs.keysUrl))))&&((this.downloadsUrl == rhs.downloadsUrl)||((this.downloadsUrl!= null)&&this.downloadsUrl.equals(rhs.downloadsUrl))))&&((this.pushedAt == rhs.pushedAt)||((this.pushedAt!= null)&&this.pushedAt.equals(rhs.pushedAt))))&&((this.contentsUrl == rhs.contentsUrl)||((this.contentsUrl!= null)&&this.contentsUrl.equals(rhs.contentsUrl))))&&((this.tagsUrl == rhs.tagsUrl)||((this.tagsUrl!= null)&&this.tagsUrl.equals(rhs.tagsUrl))))&&((this.size == rhs.size)||((this.size!= null)&&this.size.equals(rhs.size))))&&((this.commentsUrl == rhs.commentsUrl)||((this.commentsUrl!= null)&&this.commentsUrl.equals(rhs.commentsUrl))))&&((this.treesUrl == rhs.treesUrl)||((this.treesUrl!= null)&&this.treesUrl.equals(rhs.treesUrl))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.mergesUrl == rhs.mergesUrl)||((this.mergesUrl!= null)&&this.mergesUrl.equals(rhs.mergesUrl))))&&((this.nodeId == rhs.nodeId)||((this.nodeId!= null)&&this.nodeId.equals(rhs.nodeId))))&&((this.teamsUrl == rhs.teamsUrl)||((this.teamsUrl!= null)&&this.teamsUrl.equals(rhs.teamsUrl))))&&((this.blobsUrl == rhs.blobsUrl)||((this.blobsUrl!= null)&&this.blobsUrl.equals(rhs.blobsUrl))))&&((this.issueEventsUrl == rhs.issueEventsUrl)||((this.issueEventsUrl!= null)&&this.issueEventsUrl.equals(rhs.issueEventsUrl))))&&((this.milestonesUrl == rhs.milestonesUrl)||((this.milestonesUrl!= null)&&this.milestonesUrl.equals(rhs.milestonesUrl))))&&((this.issuesUrl == rhs.issuesUrl)||((this.issuesUrl!= null)&&this.issuesUrl.equals(rhs.issuesUrl))))&&((this.releasesUrl == rhs.releasesUrl)||((this.releasesUrl!= null)&&this.releasesUrl.equals(rhs.releasesUrl))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.branchesUrl == rhs.branchesUrl)||((this.branchesUrl!= null)&&this.branchesUrl.equals(rhs.branchesUrl))))&&((this.contributorsUrl == rhs.contributorsUrl)||((this.contributorsUrl!= null)&&this.contributorsUrl.equals(rhs.contributorsUrl))))&&((this.gitRefsUrl == rhs.gitRefsUrl)||((this.gitRefsUrl!= null)&&this.gitRefsUrl.equals(rhs.gitRefsUrl))))&&((this.openIssuesCount == rhs.openIssuesCount)||((this.openIssuesCount!= null)&&this.openIssuesCount.equals(rhs.openIssuesCount))))&&((this.hooksUrl == rhs.hooksUrl)||((this.hooksUrl!= null)&&this.hooksUrl.equals(rhs.hooksUrl))))&&((this.stargazersCount == rhs.stargazersCount)||((this.stargazersCount!= null)&&this.stargazersCount.equals(rhs.stargazersCount))))&&((this.owner == rhs.owner)||((this.owner!= null)&&this.owner.equals(rhs.owner))))&&((this.compareUrl == rhs.compareUrl)||((this.compareUrl!= null)&&this.compareUrl.equals(rhs.compareUrl))))&&((this.gitCommitsUrl == rhs.gitCommitsUrl)||((this.gitCommitsUrl!= null)&&this.gitCommitsUrl.equals(rhs.gitCommitsUrl))))&&((this.htmlUrl == rhs.htmlUrl)||((this.htmlUrl!= null)&&this.htmlUrl.equals(rhs.htmlUrl))))&&((this.stargazersUrl == rhs.stargazersUrl)||((this.stargazersUrl!= null)&&this.stargazersUrl.equals(rhs.stargazersUrl))))&&((this.fullName == rhs.fullName)||((this.fullName!= null)&&this.fullName.equals(rhs.fullName))))&&((this.url == rhs.url)||((this.url!= null)&&this.url.equals(rhs.url))))&&((this.pullsUrl == rhs.pullsUrl)||((this.pullsUrl!= null)&&this.pullsUrl.equals(rhs.pullsUrl))))&&((this.fork == rhs.fork)||((this.fork!= null)&&this.fork.equals(rhs.fork))))&&((this.deploymentsUrl == rhs.deploymentsUrl)||((this.deploymentsUrl!= null)&&this.deploymentsUrl.equals(rhs.deploymentsUrl))))&&((this.eventsUrl == rhs.eventsUrl)||((this.eventsUrl!= null)&&this.eventsUrl.equals(rhs.eventsUrl))))&&((this.gitTagsUrl == rhs.gitTagsUrl)||((this.gitTagsUrl!= null)&&this.gitTagsUrl.equals(rhs.gitTagsUrl))))&&((this.notificationsUrl == rhs.notificationsUrl)||((this.notificationsUrl!= null)&&this.notificationsUrl.equals(rhs.notificationsUrl))))&&((this.homepage == rhs.homepage)||((this.homepage!= null)&&this.homepage.equals(rhs.homepage))))&&((this.subscriptionUrl == rhs.subscriptionUrl)||((this.subscriptionUrl!= null)&&this.subscriptionUrl.equals(rhs.subscriptionUrl))));
    }

    public static class RepoSearchResultItemBuilder
        extends RepoSearchResultItem.RepoSearchResultItemBuilderBase<RepoSearchResultItem>
    {


        public RepoSearchResultItemBuilder() {
            super();
        }

        public RepoSearchResultItemBuilder(Integer id, String nodeId, String name, String fullName, SimpleUser owner, Boolean _private, URI htmlUrl, String description, Boolean fork, URI url, ZonedDateTime createdAt, ZonedDateTime updatedAt, ZonedDateTime pushedAt, URI homepage, Integer size, Integer stargazersCount, Integer watchersCount, String language, Integer forksCount, Integer openIssuesCount, String masterBranch, String defaultBranch, BigDecimal score, URI forksUrl, String keysUrl, String collaboratorsUrl, String teamsUrl, String hooksUrl, String issueEventsUrl, String eventsUrl, String assigneesUrl, String branchesUrl, String tagsUrl, String blobsUrl, String gitTagsUrl, String gitRefsUrl, String treesUrl, String statusesUrl, String languagesUrl, String stargazersUrl, String contributorsUrl, String subscribersUrl, String subscriptionUrl, String commitsUrl, String gitCommitsUrl, String commentsUrl, String issueCommentUrl, String contentsUrl, String compareUrl, String mergesUrl, String archiveUrl, String downloadsUrl, String issuesUrl, String pullsUrl, String milestonesUrl, String notificationsUrl, String labelsUrl, String releasesUrl, String deploymentsUrl) {
            super(id, nodeId, name, fullName, owner, _private, htmlUrl, description, fork, url, createdAt, updatedAt, pushedAt, homepage, size, stargazersCount, watchersCount, language, forksCount, openIssuesCount, masterBranch, defaultBranch, score, forksUrl, keysUrl, collaboratorsUrl, teamsUrl, hooksUrl, issueEventsUrl, eventsUrl, assigneesUrl, branchesUrl, tagsUrl, blobsUrl, gitTagsUrl, gitRefsUrl, treesUrl, statusesUrl, languagesUrl, stargazersUrl, contributorsUrl, subscribersUrl, subscriptionUrl, commitsUrl, gitCommitsUrl, commentsUrl, issueCommentUrl, contentsUrl, compareUrl, mergesUrl, archiveUrl, downloadsUrl, issuesUrl, pullsUrl, milestonesUrl, notificationsUrl, labelsUrl, releasesUrl, deploymentsUrl);
        }

    }

    public static abstract class RepoSearchResultItemBuilderBase<T extends RepoSearchResultItem >{

        protected T instance;

        @SuppressWarnings("unchecked")
        public RepoSearchResultItemBuilderBase() {
            // Skip initialization when called from subclass
            if (this.getClass().equals(RepoSearchResultItem.RepoSearchResultItemBuilder.class)) {
                this.instance = ((T) new RepoSearchResultItem());
            }
        }

        @SuppressWarnings("unchecked")
        public RepoSearchResultItemBuilderBase(Integer id, String nodeId, String name, String fullName, SimpleUser owner, Boolean _private, URI htmlUrl, String description, Boolean fork, URI url, ZonedDateTime createdAt, ZonedDateTime updatedAt, ZonedDateTime pushedAt, URI homepage, Integer size, Integer stargazersCount, Integer watchersCount, String language, Integer forksCount, Integer openIssuesCount, String masterBranch, String defaultBranch, BigDecimal score, URI forksUrl, String keysUrl, String collaboratorsUrl, String teamsUrl, String hooksUrl, String issueEventsUrl, String eventsUrl, String assigneesUrl, String branchesUrl, String tagsUrl, String blobsUrl, String gitTagsUrl, String gitRefsUrl, String treesUrl, String statusesUrl, String languagesUrl, String stargazersUrl, String contributorsUrl, String subscribersUrl, String subscriptionUrl, String commitsUrl, String gitCommitsUrl, String commentsUrl, String issueCommentUrl, String contentsUrl, String compareUrl, String mergesUrl, String archiveUrl, String downloadsUrl, String issuesUrl, String pullsUrl, String milestonesUrl, String notificationsUrl, String labelsUrl, String releasesUrl, String deploymentsUrl) {
            // Skip initialization when called from subclass
            if (this.getClass().equals(RepoSearchResultItem.RepoSearchResultItemBuilder.class)) {
                this.instance = ((T) new RepoSearchResultItem(id, nodeId, name, fullName, owner, _private, htmlUrl, description, fork, url, createdAt, updatedAt, pushedAt, homepage, size, stargazersCount, watchersCount, language, forksCount, openIssuesCount, masterBranch, defaultBranch, score, forksUrl, keysUrl, collaboratorsUrl, teamsUrl, hooksUrl, issueEventsUrl, eventsUrl, assigneesUrl, branchesUrl, tagsUrl, blobsUrl, gitTagsUrl, gitRefsUrl, treesUrl, statusesUrl, languagesUrl, stargazersUrl, contributorsUrl, subscribersUrl, subscriptionUrl, commitsUrl, gitCommitsUrl, commentsUrl, issueCommentUrl, contentsUrl, compareUrl, mergesUrl, archiveUrl, downloadsUrl, issuesUrl, pullsUrl, milestonesUrl, notificationsUrl, labelsUrl, releasesUrl, deploymentsUrl));
            }
        }

        public T build() {
            T result;
            result = this.instance;
            this.instance = null;
            return result;
        }

        public RepoSearchResultItem.RepoSearchResultItemBuilderBase withId(Integer id) {
            ((RepoSearchResultItem) this.instance).id = id;
            return this;
        }

        public RepoSearchResultItem.RepoSearchResultItemBuilderBase withNodeId(String nodeId) {
            ((RepoSearchResultItem) this.instance).nodeId = nodeId;
            return this;
        }

        public RepoSearchResultItem.RepoSearchResultItemBuilderBase withName(String name) {
            ((RepoSearchResultItem) this.instance).name = name;
            return this;
        }

        public RepoSearchResultItem.RepoSearchResultItemBuilderBase withFullName(String fullName) {
            ((RepoSearchResultItem) this.instance).fullName = fullName;
            return this;
        }

        public RepoSearchResultItem.RepoSearchResultItemBuilderBase withOwner(SimpleUser owner) {
            ((RepoSearchResultItem) this.instance).owner = owner;
            return this;
        }

        public RepoSearchResultItem.RepoSearchResultItemBuilderBase withPrivate(Boolean _private) {
            ((RepoSearchResultItem) this.instance)._private = _private;
            return this;
        }

        public RepoSearchResultItem.RepoSearchResultItemBuilderBase withHtmlUrl(URI htmlUrl) {
            ((RepoSearchResultItem) this.instance).htmlUrl = htmlUrl;
            return this;
        }

        public RepoSearchResultItem.RepoSearchResultItemBuilderBase withDescription(String description) {
            ((RepoSearchResultItem) this.instance).description = description;
            return this;
        }

        public RepoSearchResultItem.RepoSearchResultItemBuilderBase withFork(Boolean fork) {
            ((RepoSearchResultItem) this.instance).fork = fork;
            return this;
        }

        public RepoSearchResultItem.RepoSearchResultItemBuilderBase withUrl(URI url) {
            ((RepoSearchResultItem) this.instance).url = url;
            return this;
        }

        public RepoSearchResultItem.RepoSearchResultItemBuilderBase withCreatedAt(ZonedDateTime createdAt) {
            ((RepoSearchResultItem) this.instance).createdAt = createdAt;
            return this;
        }

        public RepoSearchResultItem.RepoSearchResultItemBuilderBase withUpdatedAt(ZonedDateTime updatedAt) {
            ((RepoSearchResultItem) this.instance).updatedAt = updatedAt;
            return this;
        }

        public RepoSearchResultItem.RepoSearchResultItemBuilderBase withPushedAt(ZonedDateTime pushedAt) {
            ((RepoSearchResultItem) this.instance).pushedAt = pushedAt;
            return this;
        }

        public RepoSearchResultItem.RepoSearchResultItemBuilderBase withHomepage(URI homepage) {
            ((RepoSearchResultItem) this.instance).homepage = homepage;
            return this;
        }

        public RepoSearchResultItem.RepoSearchResultItemBuilderBase withSize(Integer size) {
            ((RepoSearchResultItem) this.instance).size = size;
            return this;
        }

        public RepoSearchResultItem.RepoSearchResultItemBuilderBase withStargazersCount(Integer stargazersCount) {
            ((RepoSearchResultItem) this.instance).stargazersCount = stargazersCount;
            return this;
        }

        public RepoSearchResultItem.RepoSearchResultItemBuilderBase withWatchersCount(Integer watchersCount) {
            ((RepoSearchResultItem) this.instance).watchersCount = watchersCount;
            return this;
        }

        public RepoSearchResultItem.RepoSearchResultItemBuilderBase withLanguage(String language) {
            ((RepoSearchResultItem) this.instance).language = language;
            return this;
        }

        public RepoSearchResultItem.RepoSearchResultItemBuilderBase withForksCount(Integer forksCount) {
            ((RepoSearchResultItem) this.instance).forksCount = forksCount;
            return this;
        }

        public RepoSearchResultItem.RepoSearchResultItemBuilderBase withOpenIssuesCount(Integer openIssuesCount) {
            ((RepoSearchResultItem) this.instance).openIssuesCount = openIssuesCount;
            return this;
        }

        public RepoSearchResultItem.RepoSearchResultItemBuilderBase withMasterBranch(String masterBranch) {
            ((RepoSearchResultItem) this.instance).masterBranch = masterBranch;
            return this;
        }

        public RepoSearchResultItem.RepoSearchResultItemBuilderBase withDefaultBranch(String defaultBranch) {
            ((RepoSearchResultItem) this.instance).defaultBranch = defaultBranch;
            return this;
        }

        public RepoSearchResultItem.RepoSearchResultItemBuilderBase withScore(BigDecimal score) {
            ((RepoSearchResultItem) this.instance).score = score;
            return this;
        }

        public RepoSearchResultItem.RepoSearchResultItemBuilderBase withForksUrl(URI forksUrl) {
            ((RepoSearchResultItem) this.instance).forksUrl = forksUrl;
            return this;
        }

        public RepoSearchResultItem.RepoSearchResultItemBuilderBase withKeysUrl(String keysUrl) {
            ((RepoSearchResultItem) this.instance).keysUrl = keysUrl;
            return this;
        }

        public RepoSearchResultItem.RepoSearchResultItemBuilderBase withCollaboratorsUrl(String collaboratorsUrl) {
            ((RepoSearchResultItem) this.instance).collaboratorsUrl = collaboratorsUrl;
            return this;
        }

        public RepoSearchResultItem.RepoSearchResultItemBuilderBase withTeamsUrl(String teamsUrl) {
            ((RepoSearchResultItem) this.instance).teamsUrl = teamsUrl;
            return this;
        }

        public RepoSearchResultItem.RepoSearchResultItemBuilderBase withHooksUrl(String hooksUrl) {
            ((RepoSearchResultItem) this.instance).hooksUrl = hooksUrl;
            return this;
        }

        public RepoSearchResultItem.RepoSearchResultItemBuilderBase withIssueEventsUrl(String issueEventsUrl) {
            ((RepoSearchResultItem) this.instance).issueEventsUrl = issueEventsUrl;
            return this;
        }

        public RepoSearchResultItem.RepoSearchResultItemBuilderBase withEventsUrl(String eventsUrl) {
            ((RepoSearchResultItem) this.instance).eventsUrl = eventsUrl;
            return this;
        }

        public RepoSearchResultItem.RepoSearchResultItemBuilderBase withAssigneesUrl(String assigneesUrl) {
            ((RepoSearchResultItem) this.instance).assigneesUrl = assigneesUrl;
            return this;
        }

        public RepoSearchResultItem.RepoSearchResultItemBuilderBase withBranchesUrl(String branchesUrl) {
            ((RepoSearchResultItem) this.instance).branchesUrl = branchesUrl;
            return this;
        }

        public RepoSearchResultItem.RepoSearchResultItemBuilderBase withTagsUrl(String tagsUrl) {
            ((RepoSearchResultItem) this.instance).tagsUrl = tagsUrl;
            return this;
        }

        public RepoSearchResultItem.RepoSearchResultItemBuilderBase withBlobsUrl(String blobsUrl) {
            ((RepoSearchResultItem) this.instance).blobsUrl = blobsUrl;
            return this;
        }

        public RepoSearchResultItem.RepoSearchResultItemBuilderBase withGitTagsUrl(String gitTagsUrl) {
            ((RepoSearchResultItem) this.instance).gitTagsUrl = gitTagsUrl;
            return this;
        }

        public RepoSearchResultItem.RepoSearchResultItemBuilderBase withGitRefsUrl(String gitRefsUrl) {
            ((RepoSearchResultItem) this.instance).gitRefsUrl = gitRefsUrl;
            return this;
        }

        public RepoSearchResultItem.RepoSearchResultItemBuilderBase withTreesUrl(String treesUrl) {
            ((RepoSearchResultItem) this.instance).treesUrl = treesUrl;
            return this;
        }

        public RepoSearchResultItem.RepoSearchResultItemBuilderBase withStatusesUrl(String statusesUrl) {
            ((RepoSearchResultItem) this.instance).statusesUrl = statusesUrl;
            return this;
        }

        public RepoSearchResultItem.RepoSearchResultItemBuilderBase withLanguagesUrl(String languagesUrl) {
            ((RepoSearchResultItem) this.instance).languagesUrl = languagesUrl;
            return this;
        }

        public RepoSearchResultItem.RepoSearchResultItemBuilderBase withStargazersUrl(String stargazersUrl) {
            ((RepoSearchResultItem) this.instance).stargazersUrl = stargazersUrl;
            return this;
        }

        public RepoSearchResultItem.RepoSearchResultItemBuilderBase withContributorsUrl(String contributorsUrl) {
            ((RepoSearchResultItem) this.instance).contributorsUrl = contributorsUrl;
            return this;
        }

        public RepoSearchResultItem.RepoSearchResultItemBuilderBase withSubscribersUrl(String subscribersUrl) {
            ((RepoSearchResultItem) this.instance).subscribersUrl = subscribersUrl;
            return this;
        }

        public RepoSearchResultItem.RepoSearchResultItemBuilderBase withSubscriptionUrl(String subscriptionUrl) {
            ((RepoSearchResultItem) this.instance).subscriptionUrl = subscriptionUrl;
            return this;
        }

        public RepoSearchResultItem.RepoSearchResultItemBuilderBase withCommitsUrl(String commitsUrl) {
            ((RepoSearchResultItem) this.instance).commitsUrl = commitsUrl;
            return this;
        }

        public RepoSearchResultItem.RepoSearchResultItemBuilderBase withGitCommitsUrl(String gitCommitsUrl) {
            ((RepoSearchResultItem) this.instance).gitCommitsUrl = gitCommitsUrl;
            return this;
        }

        public RepoSearchResultItem.RepoSearchResultItemBuilderBase withCommentsUrl(String commentsUrl) {
            ((RepoSearchResultItem) this.instance).commentsUrl = commentsUrl;
            return this;
        }

        public RepoSearchResultItem.RepoSearchResultItemBuilderBase withIssueCommentUrl(String issueCommentUrl) {
            ((RepoSearchResultItem) this.instance).issueCommentUrl = issueCommentUrl;
            return this;
        }

        public RepoSearchResultItem.RepoSearchResultItemBuilderBase withContentsUrl(String contentsUrl) {
            ((RepoSearchResultItem) this.instance).contentsUrl = contentsUrl;
            return this;
        }

        public RepoSearchResultItem.RepoSearchResultItemBuilderBase withCompareUrl(String compareUrl) {
            ((RepoSearchResultItem) this.instance).compareUrl = compareUrl;
            return this;
        }

        public RepoSearchResultItem.RepoSearchResultItemBuilderBase withMergesUrl(String mergesUrl) {
            ((RepoSearchResultItem) this.instance).mergesUrl = mergesUrl;
            return this;
        }

        public RepoSearchResultItem.RepoSearchResultItemBuilderBase withArchiveUrl(String archiveUrl) {
            ((RepoSearchResultItem) this.instance).archiveUrl = archiveUrl;
            return this;
        }

        public RepoSearchResultItem.RepoSearchResultItemBuilderBase withDownloadsUrl(String downloadsUrl) {
            ((RepoSearchResultItem) this.instance).downloadsUrl = downloadsUrl;
            return this;
        }

        public RepoSearchResultItem.RepoSearchResultItemBuilderBase withIssuesUrl(String issuesUrl) {
            ((RepoSearchResultItem) this.instance).issuesUrl = issuesUrl;
            return this;
        }

        public RepoSearchResultItem.RepoSearchResultItemBuilderBase withPullsUrl(String pullsUrl) {
            ((RepoSearchResultItem) this.instance).pullsUrl = pullsUrl;
            return this;
        }

        public RepoSearchResultItem.RepoSearchResultItemBuilderBase withMilestonesUrl(String milestonesUrl) {
            ((RepoSearchResultItem) this.instance).milestonesUrl = milestonesUrl;
            return this;
        }

        public RepoSearchResultItem.RepoSearchResultItemBuilderBase withNotificationsUrl(String notificationsUrl) {
            ((RepoSearchResultItem) this.instance).notificationsUrl = notificationsUrl;
            return this;
        }

        public RepoSearchResultItem.RepoSearchResultItemBuilderBase withLabelsUrl(String labelsUrl) {
            ((RepoSearchResultItem) this.instance).labelsUrl = labelsUrl;
            return this;
        }

        public RepoSearchResultItem.RepoSearchResultItemBuilderBase withReleasesUrl(String releasesUrl) {
            ((RepoSearchResultItem) this.instance).releasesUrl = releasesUrl;
            return this;
        }

        public RepoSearchResultItem.RepoSearchResultItemBuilderBase withDeploymentsUrl(String deploymentsUrl) {
            ((RepoSearchResultItem) this.instance).deploymentsUrl = deploymentsUrl;
            return this;
        }

        public RepoSearchResultItem.RepoSearchResultItemBuilderBase withAdditionalProperty(String name, Object value) {
            ((RepoSearchResultItem) this.instance).additionalProperties.put(name, value);
            return this;
        }

    }

}
