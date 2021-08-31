import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { RegisterComponent } from './register/register.component';
import { LoginComponent } from './login/login.component';
import { HomeComponent } from './home/home.component';
import { ProfileComponent } from './profile/profile.component';
import { BoardUserComponent } from './board-user/board-user.component';
import { BoardManagerComponent } from './board-manager/board-manager.component';
import { BoardAdminComponent } from './board-admin/board-admin.component';
import { ManagerSiteVisitViewComponent } from './manager-site-visit-view/manager-site-visit-view.component';
import { ManagerResourceEnquirySummaryComponent } from './manager-resource-enquiry-summary/manager-resource-enquiry-summary.component'
import { ManagerCourseEnquirySummaryComponent } from './manager-course-enquiry-summary/manager-course-enquiry-summary.component';
import { CreateResourceComponent } from './create-resource/create-resource.component';
import { ResourceListComponent } from './resource-list/resource-list.component';
import { ResourceEnquiryComponent } from './resource-enquiry/resource-enquiry.component';
import { ResourceDisplayComponent } from './resource-display/resource-display.component';

const routes: Routes = [
  { path: 'home', component: HomeComponent },
  { path: 'login', component: LoginComponent },
  { path: 'register', component: RegisterComponent },
  { path: 'profile', component: ProfileComponent },
  { path: 'user', component: BoardUserComponent },
  { path: 'manager', component: BoardManagerComponent },

  { path: 'managerSiteVisitView', component: ManagerSiteVisitViewComponent },
  { path: 'managerCourseEnquirySummary', component: ManagerCourseEnquirySummaryComponent },
  { path: 'managerResourceEnquirySummary', component: ManagerResourceEnquirySummaryComponent },


  {path:'create-resource',component: CreateResourceComponent},
  {path:'resources', component:ResourceListComponent},
  {path:'resource-enquiry',component: ResourceEnquiryComponent},
  {path:'resource-display',component: ResourceDisplayComponent},

  { path: 'admin', component: BoardAdminComponent },
  { path: '', redirectTo: 'home', pathMatch: 'full' }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
