import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';


import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { HomeComponent } from './home/home.component';
import { ProfileComponent } from './profile/profile.component';
import { BoardAdminComponent } from './board-admin/board-admin.component';
import { BoardManagerComponent } from './board-manager/board-manager.component';
import { BoardUserComponent } from './board-user/board-user.component';

import { authInterceptorProviders } from './_helpers/auth.interceptor';
// new
import { ManagerSiteVisitViewComponent } from './manager-site-visit-view/manager-site-visit-view.component';
import { ManagerCourseEnquirySummaryComponent } from './manager-course-enquiry-summary/manager-course-enquiry-summary.component';
import { ManagerResourceEnquirySummaryComponent } from './manager-resource-enquiry-summary/manager-resource-enquiry-summary.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';


import { ResourceListComponent } from './resource-list/resource-list.component';
import { CreateResourceComponent } from './create-resource/create-resource.component';
import { ResourceEnquiryComponent } from './resource-enquiry/resource-enquiry.component';
import { ResourceDisplayComponent } from './resource-display/resource-display.component';
import { UpdateResourceComponent } from './update-resource/update-resource.component';
import { SalesPipelineComponent } from './sales-pipeline/sales-pipeline.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    RegisterComponent,
    HomeComponent,
    ProfileComponent,
    BoardAdminComponent,
    BoardManagerComponent,
    BoardUserComponent,
    ManagerSiteVisitViewComponent,
    ManagerCourseEnquirySummaryComponent,
    ManagerResourceEnquirySummaryComponent,


    ResourceListComponent,
    CreateResourceComponent,
    ResourceEnquiryComponent,
    ResourceDisplayComponent,
    UpdateResourceComponent,
    SalesPipelineComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    BrowserAnimationsModule,
   
  ],
  providers: [authInterceptorProviders],
  bootstrap: [AppComponent]
})
export class AppModule { }
