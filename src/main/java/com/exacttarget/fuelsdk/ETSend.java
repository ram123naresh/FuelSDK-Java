package com.exacttarget.fuelsdk;

import com.exacttarget.fuelsdk.annotations.ExternalName;
import com.exacttarget.fuelsdk.annotations.InternalProperty;
import com.exacttarget.fuelsdk.annotations.SoapObject;
import com.exacttarget.fuelsdk.internal.Send;

import java.util.Date;


@SoapObject(internalType = Send.class)
public class ETSend extends ETSoapObject {
  @ExternalName("id")
  private String id;

  @ExternalName("subject")
  private String subject;

  @ExternalName("sendDate")
  private Date sendDate;

  @ExternalName("emailName")
  private String emailName;

  @ExternalName("previewURL")
  private String previewURL;

  @ExternalName("email")
  @InternalProperty("Email.ID")
  private ETEmail email = null;

  @Override
  public String getId() {
    return id;
  }


  @Override
  public void setId(String id) {
    this.id = id;
  }

  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public Date getSendDate() {
    return sendDate;
  }

  public void setSendDate(Date sendDate) {
    this.sendDate = sendDate;
  }

  public String getEmailName() {
    return emailName;
  }

  public void setEmailName(String emailName) {
    this.emailName = emailName;
  }

  public String getPreviewURL() {
    return previewURL;
  }

  public void setPreviewURL(String previewURL) {
    this.previewURL = previewURL;
  }

  public ETEmail getEmail() {
    return email;
  }

  public void setEmail(ETEmail email) {
    this.email = email;
  }
}