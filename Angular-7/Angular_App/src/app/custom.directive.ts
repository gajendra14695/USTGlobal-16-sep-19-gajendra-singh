import { ElementRef, Directive, HostBinding, HostListener } from '@angular/core';

@Directive({
    selector : '[custdir]',
})

export class CustomDirective {
    constructor(private el : ElementRef){
        this.el.nativeElement.style.backgroundColor = 'red';

    }
    @HostBinding('style.color') colorName ='blue';
    @HostListener('mouseenter') m() {
        this.el.nativeElement.style.backgroundColor ='pink';
    }
    @HostListener('mouseleave') n() {
        this.el.nativeElement.style.backgroundColor ='green';
    }

}