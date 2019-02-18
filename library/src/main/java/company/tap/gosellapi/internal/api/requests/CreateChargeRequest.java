package company.tap.gosellapi.internal.api.requests;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;
import java.util.HashMap;

import company.tap.gosellapi.open.models.Customer;
import company.tap.gosellapi.internal.api.models.Order;
import company.tap.gosellapi.open.models.Receipt;
import company.tap.gosellapi.open.models.Reference;
import company.tap.gosellapi.internal.api.models.SourceRequest;
import company.tap.gosellapi.internal.api.models.TrackingURL;

@RestrictTo(RestrictTo.Scope.LIBRARY)
public class CreateChargeRequest {

    @SerializedName("amount")
    @Expose
    @NonNull private BigDecimal amount;

    @SerializedName("currency")
    @Expose
    @NonNull private String currency;

    @SerializedName("customer")
    @Expose
    @NonNull private Customer customer;

    @SerializedName("fee")
    @Expose
    @NonNull private BigDecimal fee;

    @SerializedName("order")
    @Expose
    @NonNull private Order order;

    @SerializedName("redirect")
    @Expose
    @NonNull private TrackingURL redirect;

    @SerializedName("post")
    @Expose
    @Nullable private TrackingURL post;

    @SerializedName("source")
    @Expose
    @NonNull private SourceRequest source;

    @SerializedName("description")
    @Expose
    @Nullable private String description;

    @SerializedName("metadata")
    @Expose
    @Nullable private HashMap<String, String> metadata;

    @SerializedName("reference")
    @Expose
    @Nullable private Reference reference;

    @SerializedName("save_card")
    @Expose
    private boolean saveCard;

    @SerializedName("statement_descriptor")
    @Expose
    @Nullable private String statementDescriptor;

    @SerializedName("threeDSecure")
    @Expose
    @Nullable private Boolean threeDSecure = true;

    @SerializedName("receipt")
    @Expose
    @Nullable private Receipt receipt;

    public CreateChargeRequest(@NonNull     BigDecimal              amount,
                               @NonNull     String                  currency,
                               @NonNull     Customer                customer,
                               @NonNull     BigDecimal              fee,
                               @NonNull     Order                   order,
                               @NonNull     TrackingURL             redirect,
                               @Nullable    TrackingURL             post,
                               @NonNull     SourceRequest           source,
                               @Nullable    String                  description,
                               @Nullable    HashMap<String, String> metadata,
                               @Nullable    Reference               reference,
                               @NonNull     boolean                 saveCard,
                               @Nullable    String                  statementDescriptor,
                               @Nullable    boolean                 threeDSecure,
                               @Nullable    Receipt                 receipt) {

        this.amount                 = amount;
        this.currency               = currency;
        this.customer               = customer;
        this.fee                    = fee;
        this.order                  = order;
        this.redirect               = redirect;
        this.post                   = post;
        this.source                 = source;
        this.description            = description;
        this.metadata               = metadata;
        this.reference              = reference;
        this.saveCard               = saveCard;
        this.statementDescriptor    = statementDescriptor;
        this.threeDSecure           = threeDSecure;
        this.receipt                = receipt;
    }
}