import { NgModule } from '@angular/core';

import { CloudBiToolSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent } from './';

@NgModule({
    imports: [CloudBiToolSharedLibsModule],
    declarations: [JhiAlertComponent, JhiAlertErrorComponent],
    exports: [CloudBiToolSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent]
})
export class CloudBiToolSharedCommonModule {}
