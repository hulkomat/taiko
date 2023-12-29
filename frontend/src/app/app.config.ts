import { type ApplicationConfig } from '@angular/core'
import { provideRouter } from '@angular/router'

import { routes } from './app.routes'
import { provideClientHydration } from '@angular/platform-browser'
import { provideHttpClient } from '@angular/common/http'

export const BACKEND_URL = ''

export const appConfig: ApplicationConfig = {
  providers: [
    { provide: BACKEND_URL, useValue: 'https://localhost:8080/api' },
    provideRouter(routes), provideClientHydration(), provideHttpClient()]
}
