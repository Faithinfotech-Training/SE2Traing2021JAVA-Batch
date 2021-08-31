import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import{MatToolbarModule} from '@angular/material/toolbar';
import {MatMenuModule} from '@angular/material/menu';
import {MatIconModule} from '@angular/material/icon';
import {MatDividerModule} from '@angular/material/divider';
import {MatListModule} from '@angular/material/list';

import {MatSidenavModule} from '@angular/material/sidenav';

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
import { HeaderComponent } from './header/header.component';
import { SidenavComponent } from './sidenav/sidenav.component';
import { ResourceListComponent } from './resource-list/resource-list.component';
import { CreateResourceComponent } from './create-resource/create-resource.component';
import { ResourceEnquiryComponent } from './resource-enquiry/resource-enquiry.component';
import { ResourceDisplayComponent } from './resource-display/resource-display.component';

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
    HeaderComponent,
    SidenavComponent,
    ResourceListComponent,
    CreateResourceComponent,
    ResourceEnquiryComponent,
    ResourceDisplayComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    BrowserAnimationsModule,
    MatSidenavModule,
    MatListModule,
    MatDividerModule,
    MatIconModule,
    MatMenuModule,
    MatToolbarModule
  ],
  providers: [authInterceptorProviders],
  bootstrap: [AppComponent]
})
export class AppModule { }
