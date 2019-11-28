import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import {HttpClientModule } from '@angular/common/http';


import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { HelpComponent } from './help/help.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { RouterModule } from '@angular/router';
import { FooterComponent } from './footer/footer.component';
import { DataBindingComponent } from './data-binding/data-binding.component';
import { PropertyBindingComponent } from './data-binding/property-binding/property-binding.component';
import { EventBindingComponent } from './data-binding/event-binding/event-binding.component';
import { TwoWayBindingComponent } from './data-binding/two-way-binding/two-way-binding.component';
import { DriectiveComponent } from './driective/driective.component';
import { StructuralDirectiveComponent } from './driective/structural-directive/structural-directive.component';
import { NgIfComponent } from './driective/structural-directive/ng-if/ng-if.component';
import { NgForComponent } from './driective/structural-directive/ng-for/ng-for.component';
import { NgSwitchComponent } from './driective/structural-directive/ng-switch/ng-switch.component';
import { CustomDirective } from './custom.directive';
import { Assignment1Component } from './assignment1/assignment1.component';
// import { Assignment1 } from './assignment1/assignment1.1/assignment1.1.component';
import { AssignmentoneComponent } from './assignment1/assignmentone/assignmentone.component';
import { AssignmenttwoComponent } from './assignment1/assignmenttwo/assignmenttwo.component';
import { AssignmentthreeComponent } from './assignment1/assignmentthree/assignmentthree.component';
import { AssignmentfourComponent } from './assignment1/assignmentfour/assignmentfour.component';
import { ReativeFormComponent } from './reative-form/reative-form.component';
import { ChildComponent } from './child/child.component';
import { ParentComponent } from './parent/parent.component';
import { CommentComponent } from './comment/comment.component';
import { CommentDetailComponent } from './comment-detail/comment-detail.component';
import { DollarPipe } from './dollar.pipe';



@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    AboutComponent,
    HelpComponent,
    LoginComponent,
    RegisterComponent,
    FooterComponent,
    DataBindingComponent,
    PropertyBindingComponent,
    EventBindingComponent,
    TwoWayBindingComponent,
    DriectiveComponent,
    StructuralDirectiveComponent,
    NgIfComponent,
    NgForComponent,
    NgSwitchComponent,
    CustomDirective,
    Assignment1Component,
    AssignmentoneComponent,
    AssignmenttwoComponent,
    AssignmentthreeComponent,
    AssignmentfourComponent,
    ReativeFormComponent,
    ChildComponent,
    ParentComponent,
    CommentComponent,
    CommentDetailComponent,
    DollarPipe,
  
    
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
  RouterModule.forRoot([
    { path: 'home', component: HomeComponent },
    {path: 'about', component: AboutComponent },
    {path: 'help', component: HelpComponent },
    {path: 'login', component: LoginComponent },
    {path: 'register', component: RegisterComponent },
    {path: 'data', component:  PropertyBindingComponent },
    {path :'event', component :  EventBindingComponent },
    { path : 'two-way', component : TwoWayBindingComponent},
    { path :'ngif' , component : NgIfComponent},
    { path : 'item', component : NgForComponent},
    { path : 'ngswitch' , component : NgSwitchComponent},
    { path : 'Assignment' , component : Assignment1Component},
    { path : 'Assignment1' , component : AssignmentoneComponent},
    { path :  'Assignment2', component : AssignmenttwoComponent},
    { path : 'Assignment3' , component : AssignmentthreeComponent},
    { path : 'Assignment4' , component : AssignmentfourComponent},
    { path : 'reativeform' , component :  ReativeFormComponent},
    { path : 'parent',      component : ParentComponent},
    {path : 'comment', component : CommentDetailComponent}
  ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
{ }
